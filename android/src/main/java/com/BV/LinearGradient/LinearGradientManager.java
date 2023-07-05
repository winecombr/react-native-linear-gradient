package com.BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

@ReactModule(name = LinearGradientManager.REACT_CLASS)
public class LinearGradientManager extends BVLinearGradientManagerSpec<LinearGradientView> {
    public static final String REACT_CLASS = "BVLinearGradient";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POINT = "startPoint";
    public static final String PROP_END_POINT = "endPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_BORDER_RADII = "borderRadii";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected LinearGradientView createViewInstance(ThemedReactContext context) {
        return new LinearGradientView(context);
    }

    @Override
    @ReactProp(name = PROP_COLORS)
    public void setColors(LinearGradientView gradientView, ReadableArray colors) {
        gradientView.setColors(colors);
    }

    @Override
    @ReactProp(name = PROP_LOCATIONS)
    public void setLocations(LinearGradientView gradientView, ReadableArray locations) {
        if (locations != null) {
            gradientView.setLocations(locations);
        }
    }

    @Override
    @ReactProp(name = PROP_START_POS)
    public void setStartPoint(LinearGradientView gradientView, ReadableMap startPos) {
        gradientView.setStartPosition(startPos);
    }

    @Override
    @ReactProp(name = PROP_END_POS)
    public void setEndPoint(LinearGradientView gradientView, ReadableMap endPos) {
        gradientView.setEndPosition(endPos);
    }

    @Override
    @ReactProp(name = PROP_USE_ANGLE, defaultBoolean = false)
    public void setUseAngle(LinearGradientView gradientView, boolean useAngle) {
        gradientView.setUseAngle(useAngle);
    }

    @Override
    @ReactProp(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(LinearGradientView gradientView, ReadableMap in) {
        gradientView.setAngleCenter(in);
    }

    @Override
    @ReactProp(name = PROP_ANGLE, defaultFloat = 45.0f)
    public void setAngle(LinearGradientView gradientView, float angle) {
        gradientView.setAngle(angle);
    }

    // temporary solution until following issue is resolved:
    // https://github.com/facebook/react-native/issues/3198
    @Override
    @ReactProp(name = PROP_BORDER_RADII)
    public void setBorderRadii(LinearGradientView gradientView, ReadableArray borderRadii) {
        gradientView.setBorderRadii(borderRadii);
    }
}
