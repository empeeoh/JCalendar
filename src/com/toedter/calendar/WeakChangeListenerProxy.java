package com.toedter.calendar;

import java.lang.ref.WeakReference;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Fix for memory leak!
 *
 * http://blog.kriskemper.com/tag/jdatechooser/
 * http://www.toedter.com/forum/post.php?cat=1&fid=3&pid=32&page=1&v=0
 *
 */
public class WeakChangeListenerProxy implements ChangeListener {

    final private WeakReference<ChangeListener> reference;

    public WeakChangeListenerProxy(final ChangeListener listener) {
        this.reference = new WeakReference<>(listener);
    }

    @Override
    public void stateChanged(final ChangeEvent e) {
        final ChangeListener actualListener = reference.get();
        if (actualListener != null) {
            actualListener.stateChanged(e);
        }
    }

}