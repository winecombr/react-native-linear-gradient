package java.com.BV.LinearGradient;

import android.view.View;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.BVLinearGradientManagerDelegate;
import com.facebook.react.viewmanagers.BVLinearGradientManagerInterface;

public abstract class LinearGradientManagerSpec<T extends View> extends SimpleViewManager<T>
        implements BVLinearGradientManagerInterface<T> {
    private final ViewManagerDelegate<T> mDelegate;

    public LinearGradientManagerSpec() {
        mDelegate = new BVLinearGradientManagerDelegate<>(this);
    }

    @Override
    protected ViewManagerDelegate<T> getDelegate() {
        return mDelegate;
    }
}
