// @flow

import type { ViewProps } from 'react-native/Libraries/Components/View/ViewPropTypes';
import type { HostComponent } from 'react-native/Libraries/Renderer/shims/ReactNativeTypes';
import type { PointValue } from 'react-native/Libraries/StyleSheet/StyleSheetTypes';
import type { Float } from 'react-native/Libraries/Types/CodegenTypes';
import type { ColorValue } from "react-native/Libraries/StyleSheet/StyleSheet";
import codegenNativeComponent from 'react-native/Libraries/Utilities/codegenNativeComponent';

export type Props = $ReadOnly<{|
  ...ViewProps,
  startPoint?: PointValue,
  endPoint?: PointValue,
  colors: $ReadOnlyArray<ColorValue>,
  locations?: $ReadOnlyArray<Float>,
  useAngle?: boolean,
  angleCenter?: PointValue,
  angle?: Float,
  borderRadii?: $ReadOnlyArray<Float>,
|}>;

export default (codegenNativeComponent<Props>(
  'BVLinearGradient',
): HostComponent<Props>);