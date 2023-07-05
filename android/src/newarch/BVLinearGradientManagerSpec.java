package com.BV.LinearGradient;

import android.view.View;

import androidx.annotation.Nullable;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.BVLinearGradientManagerDelegate;
import com.facebook.react.viewmanagers.BVLinearGradientManagerInterface;
import com.facebook.soloader.SoLoader;

public abstract class BVLinearGradientManagerSpec<T extends View> extends SimpleViewManager<T> implements BVLinearGradientManagerInterface<T> {
  static {
    if (BuildConfig.CODEGEN_MODULE_REGISTRATION != null) {
      SoLoader.loadLibrary(BuildConfig.CODEGEN_MODULE_REGISTRATION);
    }
  }

  private final ViewManagerDelegate<T> mDelegate;

  public BVLinearGradientManagerSpec() {
    mDelegate = new BVLinearGradientManagerDelegate(this);
  }

  @Nullable
  @Override
  protected ViewManagerDelegate<T> getDelegate() {
    return mDelegate;
  }
}
