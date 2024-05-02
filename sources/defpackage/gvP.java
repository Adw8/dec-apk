package defpackage;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Path;
import android.os.Binder;
import android.os.Process;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import dev.kdrag0n.virtcontainer.R;
import java.io.File;
import java.io.FileInputStream;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: gvP  reason: default package */
/* loaded from: classes.dex */
public abstract class gvP {

    /* renamed from: R  reason: collision with other field name */
    public static final String[] f3989R;
    public static final int[] R = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};
    public static final int[] v = {16842948, 16842965, 16842966, 16842967, 16842968, 16842969, 16842972, 16842996, 16842997, 16842998, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843699, 16843700, 16843701, 16843702, 16843840, 16844091, 16844092, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.circularflow_angles, R.attr.circularflow_defaultAngle, R.attr.circularflow_defaultRadius, R.attr.circularflow_radiusInDP, R.attr.circularflow_viewCenter, R.attr.constraintSet, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layoutDescription, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_optimizationLevel, R.attr.layout_wrapBehaviorInParent};
    public static final int[] c = {16842948, 16842960, 16842972, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843039, 16843040, 16843071, 16843072, 16843551, 16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843701, 16843702, 16843770, 16843840, R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.drawPath, R.attr.flow_firstHorizontalBias, R.attr.flow_firstHorizontalStyle, R.attr.flow_firstVerticalBias, R.attr.flow_firstVerticalStyle, R.attr.flow_horizontalAlign, R.attr.flow_horizontalBias, R.attr.flow_horizontalGap, R.attr.flow_horizontalStyle, R.attr.flow_lastHorizontalBias, R.attr.flow_lastHorizontalStyle, R.attr.flow_lastVerticalBias, R.attr.flow_lastVerticalStyle, R.attr.flow_maxElementsWrap, R.attr.flow_verticalAlign, R.attr.flow_verticalBias, R.attr.flow_verticalGap, R.attr.flow_verticalStyle, R.attr.flow_wrapMode, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintRight_creator, R.attr.layout_constraintTag, R.attr.layout_constraintTop_creator, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.motionProgress, R.attr.motionStagger, R.attr.motionTarget, R.attr.pathMotionArc, R.attr.pivotAnchor, R.attr.polarRelativeTo, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transformPivotTarget, R.attr.transitionEasing, R.attr.transitionPathRotate, R.attr.visibilityMode};
    public static final int[] e = {R.attr.attributeName, R.attr.customBoolean, R.attr.customColorDrawableValue, R.attr.customColorValue, R.attr.customDimension, R.attr.customFloatValue, R.attr.customIntegerValue, R.attr.customPixelDimension, R.attr.customReference, R.attr.customStringValue, R.attr.methodName};
    public static final int[] X = {16842948, 16842996, 16842997, 16842999, 16843000, 16843001, 16843002, 16843701, 16843702, R.attr.barrierAllowsGoneWidgets, R.attr.barrierDirection, R.attr.barrierMargin, R.attr.chainUseRtl, R.attr.constraint_referenced_ids, R.attr.constraint_referenced_tags, R.attr.guidelineUseRtl, R.attr.layout_constrainedHeight, R.attr.layout_constrainedWidth, R.attr.layout_constraintBaseline_creator, R.attr.layout_constraintBaseline_toBaselineOf, R.attr.layout_constraintBaseline_toBottomOf, R.attr.layout_constraintBaseline_toTopOf, R.attr.layout_constraintBottom_creator, R.attr.layout_constraintBottom_toBottomOf, R.attr.layout_constraintBottom_toTopOf, R.attr.layout_constraintCircle, R.attr.layout_constraintCircleAngle, R.attr.layout_constraintCircleRadius, R.attr.layout_constraintDimensionRatio, R.attr.layout_constraintEnd_toEndOf, R.attr.layout_constraintEnd_toStartOf, R.attr.layout_constraintGuide_begin, R.attr.layout_constraintGuide_end, R.attr.layout_constraintGuide_percent, R.attr.layout_constraintHeight, R.attr.layout_constraintHeight_default, R.attr.layout_constraintHeight_max, R.attr.layout_constraintHeight_min, R.attr.layout_constraintHeight_percent, R.attr.layout_constraintHorizontal_bias, R.attr.layout_constraintHorizontal_chainStyle, R.attr.layout_constraintHorizontal_weight, R.attr.layout_constraintLeft_creator, R.attr.layout_constraintLeft_toLeftOf, R.attr.layout_constraintLeft_toRightOf, R.attr.layout_constraintRight_creator, R.attr.layout_constraintRight_toLeftOf, R.attr.layout_constraintRight_toRightOf, R.attr.layout_constraintStart_toEndOf, R.attr.layout_constraintStart_toStartOf, R.attr.layout_constraintTop_creator, R.attr.layout_constraintTop_toBottomOf, R.attr.layout_constraintTop_toTopOf, R.attr.layout_constraintVertical_bias, R.attr.layout_constraintVertical_chainStyle, R.attr.layout_constraintVertical_weight, R.attr.layout_constraintWidth, R.attr.layout_constraintWidth_default, R.attr.layout_constraintWidth_max, R.attr.layout_constraintWidth_min, R.attr.layout_constraintWidth_percent, R.attr.layout_editor_absoluteX, R.attr.layout_editor_absoluteY, R.attr.layout_goneMarginBaseline, R.attr.layout_goneMarginBottom, R.attr.layout_goneMarginEnd, R.attr.layout_goneMarginLeft, R.attr.layout_goneMarginRight, R.attr.layout_goneMarginStart, R.attr.layout_goneMarginTop, R.attr.layout_marginBaseline, R.attr.layout_wrapBehaviorInParent, R.attr.maxHeight, R.attr.maxWidth, R.attr.minHeight, R.attr.minWidth};
    public static final int[] O = {R.attr.animateCircleAngleTo, R.attr.animateRelativeTo, R.attr.drawPath, R.attr.motionPathRotate, R.attr.motionStagger, R.attr.pathMotionArc, R.attr.quantizeMotionInterpolator, R.attr.quantizeMotionPhase, R.attr.quantizeMotionSteps, R.attr.transitionEasing};
    public static final int[] L = {16842972, 16843551, R.attr.layout_constraintTag, R.attr.motionProgress, R.attr.visibilityMode};
    public static final int[] Z = {16842960, R.attr.constraints};
    public static final int[] m = {16843552, 16843553, 16843554, 16843555, 16843556, 16843557, 16843558, 16843559, 16843560, 16843770, 16843840, R.attr.transformPivotTarget};
    public static final int[] x = {R.attr.constraints, R.attr.region_heightLessThan, R.attr.region_heightMoreThan, R.attr.region_widthLessThan, R.attr.region_widthMoreThan};
    public static final int[] H = {16843848};

    static {
        f3989R = r0;
        String[] strArr = {"⎆鶡淭閬时鶧淺閶⎉鶮淭閡旣鶮淎閭日⎉鶱淧閶时鶫淬閥旱⎊鶱添閱时鶧淯閒旰鶭淠閧⎍鶦淧閠旷鶥淃閦旣鶲淶閧旰⎍鶡淰閣旱鶪淃閦旣鶲淶閧旰⎋鶦淰閯旑鶧淰閴旫鶡淧⎉鶴淯閁旮鶫淧閬时∩鶹涠閲旰鶫淯閣旰鶻淉閧旻鶋淦闠斸鷳涰闱斳鷺涰闶斴鷺涵问斠鶩淧閻斠鷸淙閹斠鶩淧閻旆鶣淶閣斠鷸淹闠时鶻淲閧旗鶰淮闠斸鷠淶閻旲鶧涬閥旭鶭淥閮旧鶣淲閫旱鷬淡閭旯鷭淥閭旭鶥淮閧斬鶡淰閻旲鶶淭闬时鶫淬閩斬鶇淡閫旧鶱淃閧旣鶦淊閩旦鶤淒閷无鶮淫閡旉鶧添闠斮鷠淴閣旮鶷淧闠斸鷠淇閩旓鶉淀閃日鶁淇閃族鶑淍閪旋鷶淁閨旀鷲淧閚旀鶮淎閯旦鶴淠闰旦鶱淘閕旄鶵淣閚族鶷淛闰斻鶶淎闰旦鶴淠闰旦鶱淘閑斷鶨淡閬旮鶵淦閅斺鶷淦閅旮鶷淣閻斷鶀淘閚旌鶊淛闰斳鶎淘閚早鶑淃閪旃鶓淅閃旇鶛淃閪旭鶪淃閒旭鶲淓閺旵鶣淣闺旯鶲涴閳早鶫淸閫斩鷳淋閪旨鶒涷閫旍鶲液閌旷鷴淭閺旤鶧淶閸旉鶛涱閘旱鶕淋閫旇鶃液閏旷鶍涱闱旳鶄淊閥旳鷵淲闲旑鶦淍閏旦鷺淈閔旮鶅涴閴旖鶍淓閁旘鷷淦閅旧鶴淏閐旌鶫淘閌旵鷿涠问斠鶩淧閻族鶣淶閧旰鶫淣閮旖鶻淲閧斠鷸涠閃旑鶛淏閏旇鶖淐開旁鶝淒閗旀鶎淋閁斠鶿涮闠旱鶶淣閶旷鶱涠闸斠鶇淌閃旀鶎淇閆斠鷮涠閩旧鶻淋閦斠鷸涳闰斱鷳涺闰斶鷴涺闵斮鷠淭閷时鶲混閶旒鶰淧閤旫鶺淖閻旲鶧涠闸斠鶖淋閌旉鷠淿閟旿⎅鶤淫閮旧⎳鶥淧閶旗鶰淫閄旭鶰淄閫旮鶧涪閡旭鶬淶閧旺鶶涮闢旡뷤淐閝旃鶗淖閊旍鶐淋閖旛鶝淑閗旄鶄淋閚斮鷢淤閫旮鶧涫⎌鶦淧閠旷鶥淝閰旧鶲淭閰时鶱⎖鶬淧閱时鶠淭閺斯鶦淧閠旷鶥淝闧旱鷬淰閧旲鶭淰閶⎠鶋淑閍旝鶋淌閑旖鶃淌閖斬鶤淭閰旯鶣淶闪旋鶬深閶旣鶬淶闬旬鶭淵闪斫鷫⎒鶤淭閰旯鶣淶闪时鶪淫閱斮鷢涨閣旰鶥深闫⎊鶦淫閣日鶝淰閧旲鶭淰閶⎣鶐淧閯旭鶶淧闢旰鶧淲閭旰鶶涢閡旭鶮淮閧旡鶶淫閭旬鷢淶閫旯鶧淦闢旭鶷淶⎨鶄淣閫旮鶧淦闢时鶭涢閡旣鶬淡閧旮鷢淰閧旯鶭淶閧斢鶰淧閲旭鶰淶闢旡鶭淮閮旧鶡淶閫旭鶬⎐鶮淭閡旣鶮涭閱旧鶰淴閫旡鶧涬閮旭鶥⎑鶡淭閬时鶧淺閶斬鶤淫閮旧鶱淆閫旰⎊鶡淭閬旱鶭淮閧斬鶮淭閥⎈鶫淬閤旭鷬淨閱旭鶬⎐鶮淭閡旣鶮涭閱旻鶱淶閧旯鷬淲閰旭鶲⎳鶣淡閶旫鶴淫閶旻鶏淣閬旣鶥淧閰斬鶥淧閶旊鶫深閶旭뷤深閱旇鶺淫閶旐鶧淣閱旭鶬深闪旬鶷淮閮斮鷢液问斢鷲涫⎦鶄淣閫旮鶧淦闢时鶭涢閵旰鶫淶閧斢鶪淫閱时鶭淰閫旡鶣淮闢旧鶺淫閶斢鶰淧閣旱鶭淬閱⎍鶮淭閡旣鶮涭閷旫鷬淮閭日⎑鶮淭閡旣鶮涭閱旻鶱淶閧旯鷬淮閭日⎊鶦淫閣日鶝淰閧旲鶭淰閶⎈鶮淭閥旡鶣淶闢斯鶦⎦鶥淧閶旐鶷淬閶旫鶯淧闪斫鷬淧閺旧鶡涪閡旯鶦涫闈斢鷢涢闢斬鶫淬閲旷鶶淑閶旰鶧淣閯⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎈鶇淚開旖鶝淑閇旎鶄⎉鶑淋閅旌鶃淎閇旆⎋鶎淍閕旝鶏淇閏旍鶐淛⎕鶃淒閒斢鶁淐閃旑鶊涪閇旚鶁淇閒旖鶋淍閌斫⎐鶃淒閒斢鶁淐閃旑鶊涪閌旃鶖淋閔旇鷫⎂鶃淌閐⎗鶋淌開旖鶋淃閎旋鶘淃閖旋鶍淌闢旄鶃淋閎旗鶐淇⎐鶒淇閐族鶋淑閑旋鶍淌闢旁鶊淃閌旅鶇⎙鶇淚閁旇鶑淑開旔鶇涢閐旇鶑淍閗旐鶁淇闢旗鶑淃閅旇⎏鶗淑閇旐鷢淐閇旓鶗淇閑旖鶇淆⎍鶗淑閇旐鷢淑閖旍鶒淒閇旆⎎鶆淇閒旇鶌淆閇旌鶁淛闢旆鶋淇閆⎔鶍淖閊旇鶐涢閉旋鶎淎閑斢鶀淛闢旑鶛淑閖旇鶏⎆鶗淌閉旌鶍淕閌⎌鶦淧閠旷鶥淝閰旧鶲淭閰时鶱⎖鶬淧閱时鶠淭閺斯鶦淧閠旷鶥淝闧旱鷬淰閧旲鶭淰閶∩鶹涠閲旰鶫淯閣旰鶻淉閧旻鶋淦闠斸鷳涰闱斳鷺涰闶斴鷺涵问斠鶩淧閻斠鷸淙閹斠鶩淧閻旆鶣淶閣斠鷸淹闠时鶻淲閧旗鶰淮闠斸鷠淶閻旲鶧涬閥旭鶭淥閮旧鶣淲閫旱鷬淡閭旯鷭淥閭旭鶥淮閧斬鶡淰閻旲鶶淭闬时鶫淬閩斬鶇淡閫旧鶱淃閧旣鶦淊閩旦鶤淒閷无鶮淫閡旉鶧添闠斮鷠淴閣旮鶷淧闠斸鷠淇閩旓鶉淀閃日鶁淇閃族鶑淍閪旋鷶淁閨旀鷲淧閚旀鶮淎閯旦鶴淠闰旦鶱淘閕旄鶵淣閚族鶷淛闰斻鶶淎闰旦鶴淠闰旦鶱淘閑斷鶨淡閬旮鶵淦閅斺鶷淦閅旮鶷淣閻斷鶀淘閚旌鶊淛闰斳鶎淘閚早鶑淃閪旃鶓淅閃旇鶛淃閪旭鶪淃閒旭鶲淓閺旵鶣淣闺旯鶲涴閳早鶫淸閫斩鷳淋閪旨鶒涷閫旍鶲液閌旷鷴淭閺旤鶧淶閸旉鶛涱閘旱鶕淋閫旇鶃液閏旷鶍涱闱旳鶄淊閥旳鷵淲闲旑鶦淍閏旦鷺淈閔旮鶅涴閴旖鶍淓閁旘鷷淦閅旧鶴淏閐旌鶫淘閌旵鷿涠问斠鶩淧閻族鶣淶閧旰鶫淣閮旖鶻淲閧斠鷸涠閃旑鶛淏閏旇鶖淐開旁鶝淒閗旀鶎淋閁斠鶿涮闠旱鶶淣閶旷鶱涠闸斠鶇淌閃旀鶎淇閆斠鷮涠閩旧鶻淋閦斠鷸涳闰斱鷳涺闰斶鷴涺闵斮鷠淭閷时鶲混閶旒鶰淧閤旫鶺淖閻旲鶧涠闸斠鶖淋閌旉鷠淿閟旿⎇鶥淮閭无鶣淮⎤鶱淧閶时鶫淬閥旱鶝淧閬旣鶠淮閧旝鶯淭閬旫鶶淭閰旝鶲淪閣旬鶶淭閯旝鶲淰閭旡鶱⎙鶲淰閫旴鷭深閧时鶶淫閬日鶱涭閥旮鶭淠閣旮鷬淶閺时⎙鶲淰閫旴鷭深閧时鶶淫閬日鶱涭閱旻鶱淶閧旯鷬淶閺时⎙鶲淰閫旴鷭深閧时鶶淫閬日鶱涭閱旧鶡混閰旧鷬淶閺时⎒鶡淭閬时鶧淺閶斬鶲淣閡早鶣淥閧旌鶣淯閧⎚鷳涬闲斬鷲涯閠旧鶶淣闵斯鶧涳閣旣鷱淣间斯鶲淣閶旰鶧淭閬⎠鶋淑閍旝鶋淌閑旖鶃淌閖斬鶤淭閰旯鶣淶闪旋鶬深閶旣鶬淶闬旬鶭淵闪斫鷫⎇鶱添閱时鶧淯⎇鶥淮閭无鶣淮⎇鶱淧閡旷鶰淧⏗鶬混閮旮鷢淡閣旬鶬淭閶斢鶠淧闢旡鶣深閶斢鶶淭闢旬鶭淬闯旬鶷淮閮斢鶶添閲旧鷢淩閭时鶮淫閬斬鶡淭閮旮鶧淡閶旫鶭淬閱斬鶏淣閲斾鶩淭閶旮鶫淬闬旑鶶淰閫旬鶥涮闢早鶭淶閮旫鶬涬閃旬鶻涼⎅鶦淣閶旣⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎃鶫淶⎳鶭淤開旬鶱淶閣旬鶶涪開旬鶱淶閣旬鶶涬閭旤鶇淲閭旡뷤涢闬旤鶭淰閯旣鶶涪閎旍鶅淝閖旋鶏淇閝旄鶍淐閏旃鶖涫⎑鶧淺閫时鷬淲閰旭鶡淧閱旱鶌淣閯旧⎅鶦淣閶旣⎆鶥淧閶旲鶰淭閲⎦鶥淧閶旐鶷淬閶旫鶯淧闪斫鷬淧閺旧鶡涪閡旯鶦涫闈斢鷢涢闢斬鶫淬閲旷鶶淑閶旰鶧淣閯⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎘鶦淧閴斬鶩淦閰旣鶥液閬斬鶴淫閰时鶡淭閬时鶣淫閬旧鶰⎚鷳涬闲斬鷲涯閠旧鶶淣闵斯鶧涳閣旣鷱淣间斯鶲淣閶旰鶧淭閬⎌鶴淫閰时鶡淭閬时鶣淫閬旧鶰⎛鶖淧閰旯鶷淺闢斪鶶淧閰旯鶫淬閣旮鷯淧閯旷鶮淣閶旭鶰涫⎮鶪淶閶旲鶱涸闭断鶵淵閵斬鶣淲閣旡鶪淧闬旭鶰淥闭旮鶫淡閧旬鶱淧閱断鶎淋閁旇鶌淑閇斯鷰涬闲斬鶶淺閶⎗鶖淧閰旯鶷淺闢斪鶶淧閰旯鶫淬閣旮鷯淴閫旧鶵涫⎮鶪淶閶旲鶱涸闭断鶵淵閵斬鶣淲閣旡鶪淧闬旭鶰淥闭旮鶫淡閧旬鶱淧閱断鶎淋閁旇鶌淑閇斯鷰涬闲斬鶶淺閶⎌鶁淣閱旡鶣淦閫旣鷢淁閭旦鶧⎽鶪淶閶旲鶱涸闭断鶥淫閶旪鶷淠闬旡鶭淯闭旯鶫淡閰旭鶱淭閤时鷭淡閣旱鶡淣閦旫鶣涯閡旭鶦淧闭无鶮淭閠断鶯淣閫旬鷭淎開旁鶇淌閑旇⎄鶎淫閬旷鶺⏈鶪淶閶旲鶱涸闭断鶥淫閶旪鶷淠闬旡鶭淯闭早鶦淰閣日鷲淬闭旮鶫淬閷旺鷯淴閫旰鶶淡閭旬鶶淣閫旬鶧淰闭无鶮淭閠断鶴淫閰时鶡淭閬时鶣淫閬旧鶰涭閁旍鶒淛開旌鶅⎆鶀混閱旻鶀淭閺⎡鶪淶閶旲鶱涸闭断鶠混閱旻鶠淭閺斬鶬淧閶断鶎淋閁旇鶌淑閇斬鶪淶閯旮⎑鶥淴閫旱鶭淰闯时鶣淲闯旴鶱淭閡早⎮鶪淶閶旲鶱涸闭断鶵淵閵斬鶣淲閣旡鶪淧闬旭鶰淥闭旮鶫淡閧旬鶱淧閱断鶎淋閁旇鶌淑閇斯鷰涬闲斬鶶淺閶⎂鶎淚閆⎮鶪淶閶旲鶱涸闭断鶵淵閵斬鶣淲閣旡鶪淧闬旭鶰淥闭旮鶫淡閧旬鶱淧閱断鶎淋閁旇鶌淑閇斯鷰涬闲斬鶶淺閶⎂鶲涻閱⏑鶪淶閶旲鶱涸闭断鶡淪閰旭鶯淫閷旯鷬淥閭旭鶥淮閧旱鶭混閰旡鶧涬閡旭鶯涭閡旪鶰淭閯旫鶷淯閭旱鷭淲閮旣鶶淤閭旰鶯涰闭斩鷭淰閧旤鶱涭閪旧鶣淦閱断鶯淣閫旬鷭淎開旁鶇淌閑旇⎆鶡淭閬时鶧淺閶⎉鶱淧閶时鶫淬閥旱⎊鶡淭閬旱鶭淮閧斬鶮淭閥⎇鶩淧閰旬鶧淮⎋鶰淭閭时鶤深闬旫鶯淥⎋鶦淣閶旣鷬淳閡旭鶵涰⎋鶱淵閣旲鷬淳閡旭鶵涰⎂鷲涯闵⎅鶼涳闬斲⎏鶏淣閺旒鶧淰閤旭鶰淯閣旬鶡淧⎌鶏淣閺旋鶭淒閰旫鶭淰閫时鶻⎈鶴淫閰时鶡涭閣旴鶤⎈鶁淰閧旣鶶淧闢旔鶏⎈鶴淫閰时鶡涭閣旴鶤⎉鶑淶閣旰鶶涢閔族⎃鶴淯⎥鶣淬閦旰鶭淫閦斬鶱添閱时鶧淯闬旴鶫淰閶旷鶣淮閫旸鶣淶閫旭鶬深閧旰鶴淫閡旧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎋鶰淭閭时鶤深闬旫鶯淥⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎋鶱淵閣旲鷬淳閡旭鶵涰⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎊鶔淏闢旱鶪混閶旦鶭淵閬⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎒鶲淰閭旡鶧深閱斬鶫淬閲旷鶶淑閶旰鶧淣閯⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎆鶑淶閭旲鷢淔閏⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎅鶮淫閬旧⎈鶴淫閰时鶡涭閱旴鶡⎋鶦淣閶旣鷬淳閡旭鶵涰⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎈鶴淫閰时鶡涭閱旴鶡⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎇鶩淧閰旬鶧淮⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎍鶴淫閰时鶡涭閶旫鶯淫閬日⎄鶴深閭旡鶩⎉鶨淵閶旖鶭淩閧旬⎈鶨淵閶旗鶱淧閰旋鶦⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎆鶡淭閬时鶧淺閶⎋鶡淭閬时鶰淭閮旮鶧淰⎋鶦淰閯旑鶧淰閴旫鶡淧⎐鶮淣閸旻鶒淭閰时鶄淭閰旵鶣淰閦旧鶰⎆鶡淭閬时鶰淭閮⎄鶱淶閣日鶧⎄鶱淡閭旲鶧⎄鶠淮閭旡鶩⎄鶱淡閭旲鶧⎄鶠淮閭旡鶩⎄鶱淡閭旲鶧⎄鶠淮閭旡鶩⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎌鶲淭閰时鶄淭閰旵鶣淰閦旧鶰⎌鶲淭閰时鶄淭閰旵鶣淰閦旧鶰⎈鶱淶閣旰鶶涢閮旺鶦⎉鶮淺閦斬鶱淭閡早⎅鶲淣閶旪⎏鶱淶閣旰鶶涢閴旡鶭淬閶旰鶭淮⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎓鶱淶閣旰鶶涢閪旭鶱淶闢日鶴淲閰旭鶺添⎍鶮淴閲旰鶭淺閻斬鶱淭閡早⎍鶮淴閲旰鶭淺閻斬鶱淭閡早⎍鶥淴閲旰鶭淺閻斯鶪淭閱时⎆鷯淮閫旱鶶淧閬⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎖鶱淶閣旰鶶涢閰旧鶴淧閰旱鶧涢閬旧鶶涢閲旰鶭淺閻⎋鶱淭閡早鶧淶閒旣鶶淪⎗鶱淶閣旰鶶涢閰旧鶴淧閰旱鶧涢闻旲鷢淲閰旭鶺添⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎖鶰淧閴旒鶰淭閺旻鷸涢閡旭鶬淬閧旡鶶淫閬日鷬涬闬⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎏鶌淭闢旱鶷淡閪斢鶦淧閴旫鶡淧⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎦鶰淧閴旒鶰淭閺旻鷸涢閧旺鶡淧閧旦鶧淦闢旯鶣淺闢时鶰淫閧旱鷮涢閥旫鶴淫閬日鷢混閲⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎒鶰淧閴旒鶰淭閺旻鷸涢閡旭鶬淬閧旡鶶淧閦⎁⎁⎁⎁⎁⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎟鶰淧閴旒鶰淭閺旻鷸涢閕旣鶫淶閫旬鶥涢閤旭鶰涢閶旭鶩淧閬斬鷬涬⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎒鶰淧閴旒鶰淭閺旻鷸涢閥旭鶶涢閶旭鶩淧閬⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎓鶰淧閴旒鶰淭閺旻鷸涢閱时鶭淲閲旫鶬淥⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎈鶴淫閰时鶡涭閱旴鶡⎈鶴淫閰时鶡涭閱旴鶡⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎊鶱添閬旡鷢淤閣旫鶮淧閦⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎘鶧淯閧旰鶥淧閬旡鶻涢閱旪鶷淶閦旭鶵淬闢旤鶣淫閮旧鶦⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎋鶦淣閶旣鷬淳閡旭鶵涰⎋鶴淫閰时鶡涭閦旫鶱淩⎋鶴淫閰时鶡涭閦旫鶱淩⎚鶄淣閫旮鶧淦闢时鶭涢閰旧鶲淭閰时鷢淦閫旱鶩涢閱时鶣淶閱⎋鶴淫閰时鶡涭閦旫鶱淩⎟鶑淶閣时鶱涢閷旬鶡淪閣旬鶥淧閦斮鷢淬閭时鷢淰閧旲鶭淰閶旫鶬淥⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎆鶡淭閬时鶧淺閶⎉鶱淧閶时鶫淬閥旱⎋鶦淰閯旑鶧淰閴旫鶡淧⎂鶫淬閱⎋鶧淺閶旰鶣淡閶旫鶬淥⎋鶦淣閶旣鷬淳閡旭鶵涰⏬鶬混閮旮鷢淡閣旬鶬淭閶斢鶠淧闢旡鶣深閶斢鶶淭闢旬鶭淬闯旬鶷淮閮斢鶶添閲旧鷢淩閭时鶮淫閬斬鶃淰閰旣鶻涾閖斢鶭淤闢早鶭淶閮旫鶬涬閡旭鶮淮閧旡鶶淫閭旬鶱涬閃旰鶰淣閻旱鶉淶閝旝鶃淰閰旣鶻深閈旔鶏淉閶斬鶶淭閖旻鶲淧閦旃鶰淰閣旻鷼⎎鶧淺閶旰鶣淡閶旫鶬淥闢旦鶭淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎊鶴淫閰时鶡涭閴旯鶡淶閮⎏鶰淧閱旧鶰淴閧斢鶯淧閯旭鶰添⎊鶴淫閰时鶡涭閴旯鶡淶閮⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎋鶒淰閧旲鶣淰閧斢鶔淏⎍鶴淫閰时鶡涭閡旮鶫淧閬时⎉鶑淶閣旰鶶涢閔族⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎍鶴淫閰时鶡涭閶旫鶯淫閬日⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎮鶡淣閮旮鷢淶閭斢鷥淰閧旱鶷淯閧斥鷢淠閧旤鶭淰閧斢鷥淫閬旴鶭淩閧斥鷢淵閫时鶪涢閡旭鶰淭閷时鶫淬閧⎄鶴深閭旡鶩⎉鶨淵閶旖鶭淩閧旬⎈鶨淵閶旗鶱淧閰旋鶦⎍鶴淫閰时鶡涭閡旮鶫淧閬时"};
    }

    public static void A(View view, float f) {
        int integer = view.getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130904059}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static int C(Context context, String str) {
        int i;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String e2 = qm.e(str);
        if (e2 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if (Process.myUid() == myUid && cTo.R(context.getPackageName(), packageName)) {
                AppOpsManager c2 = Gx.c(context);
                i = Gx.R(c2, e2, Binder.getCallingUid(), packageName);
                if (i == 0) {
                    i = Gx.R(c2, e2, myUid, Gx.v(context));
                }
            } else {
                i = qm.c((AppOpsManager) qm.R(context, AppOpsManager.class), e2, packageName);
            }
            if (i != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static void H(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static final byte[] I(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                th = null;
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        dVP dvp = new dVP();
                        dvp.write(read2);
                        jjU.O(fileInputStream, dvp);
                        int size = dvp.size() + i;
                        if (size >= 0) {
                            byte[] R2 = dvp.R();
                            bArr = Arrays.copyOf(bArr, size);
                            System.arraycopy(R2, 0, bArr, i, dvp.size() - 0);
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x008c, code lost:
        if (r0 == r3) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void L(int r3, java.lang.Object r4) {
        /*
            if (r4 == 0) goto L_0x00a9
            boolean r0 = r4 instanceof defpackage.aAC
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x008f
            boolean r0 = r4 instanceof defpackage.lbd
            if (r0 == 0) goto L_0x0015
            r0 = r4
            lbd r0 = (defpackage.lbd) r0
            int r0 = r0.W()
            goto L_0x008c
        L_0x0015:
            boolean r0 = r4 instanceof defpackage.f_c
            if (r0 == 0) goto L_0x001c
            r0 = r2
            goto L_0x008c
        L_0x001c:
            boolean r0 = r4 instanceof defpackage.kg9
            if (r0 == 0) goto L_0x0023
            r0 = r1
            goto L_0x008c
        L_0x0023:
            boolean r0 = r4 instanceof defpackage.iv7
            if (r0 == 0) goto L_0x002a
            r0 = 2
            goto L_0x008c
        L_0x002a:
            boolean r0 = r4 instanceof defpackage.lR3
            if (r0 == 0) goto L_0x0031
            r0 = 3
            goto L_0x008c
        L_0x0031:
            boolean r0 = r4 instanceof defpackage.bBk
            if (r0 == 0) goto L_0x0038
            r0 = 4
            goto L_0x008c
        L_0x0038:
            boolean r0 = r4 instanceof defpackage.jkN
            if (r0 == 0) goto L_0x003e
            r0 = 5
            goto L_0x008c
        L_0x003e:
            boolean r0 = r4 instanceof defpackage.mT2
            if (r0 == 0) goto L_0x0044
            r0 = 6
            goto L_0x008c
        L_0x0044:
            boolean r0 = r4 instanceof defpackage.jUU
            if (r0 == 0) goto L_0x004a
            r0 = 7
            goto L_0x008c
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0 = 8
            goto L_0x008c
        L_0x004f:
            if (r0 == 0) goto L_0x0054
            r0 = 9
            goto L_0x008c
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r0 = 10
            goto L_0x008c
        L_0x0059:
            if (r0 == 0) goto L_0x005e
            r0 = 11
            goto L_0x008c
        L_0x005e:
            if (r0 == 0) goto L_0x0063
            r0 = 13
            goto L_0x008c
        L_0x0063:
            if (r0 == 0) goto L_0x0068
            r0 = 14
            goto L_0x008c
        L_0x0068:
            if (r0 == 0) goto L_0x006d
            r0 = 15
            goto L_0x008c
        L_0x006d:
            if (r0 == 0) goto L_0x0072
            r0 = 16
            goto L_0x008c
        L_0x0072:
            if (r0 == 0) goto L_0x0077
            r0 = 17
            goto L_0x008c
        L_0x0077:
            if (r0 == 0) goto L_0x007c
            r0 = 18
            goto L_0x008c
        L_0x007c:
            if (r0 == 0) goto L_0x0081
            r0 = 19
            goto L_0x008c
        L_0x0081:
            if (r0 == 0) goto L_0x0086
            r0 = 20
            goto L_0x008c
        L_0x0086:
            if (r0 == 0) goto L_0x008b
            r0 = 21
            goto L_0x008c
        L_0x008b:
            r0 = -1
        L_0x008c:
            if (r0 != r3) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r1 = r2
        L_0x0090:
            if (r1 == 0) goto L_0x0093
            goto L_0x00a9
        L_0x0093:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            S(r4, r3)
            r3 = 0
            throw r3
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvP.L(int, java.lang.Object):void");
    }

    public static final int N(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static Map O(Map map) {
        if (!(map instanceof dsi) || (map instanceof bNA)) {
            return map;
        }
        S(map, "kotlin.collections.MutableMap");
        throw null;
    }

    public static float[] P(float[] fArr, int i) {
        if (i >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int i2 = i - 0;
                int min = Math.min(i2, length - 0);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static final void Q(jG jGVar, oIb oib) {
        jQ.Y(i(oib.O(), dwC.L));
        oIb L2 = oib.L();
        if (!(L2 == null || i(L2.O(), dwC.X) == null)) {
            li liVar = (li) i(L2.O(), dwC.O);
            if (liVar != null) {
                if (liVar.R < 0 || liVar.v < 0) {
                    return;
                }
            }
            if (oib.O().R(dwC.K)) {
                ArrayList arrayList = new ArrayList();
                List X2 = L2.X(false);
                int size = X2.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    oIb oib2 = (oIb) X2.get(i2);
                    if (oib2.O().R(dwC.K)) {
                        arrayList.add(oib2);
                        if (oib2.f6736R.L < oib.f6736R.L) {
                            i++;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    boolean Z2 = Z(arrayList);
                    int i3 = Z2 ? 0 : i;
                    int i4 = Z2 ? i : 0;
                    kEW O2 = oib.O();
                    b_t b_t = dwC.R;
                    O2.getClass();
                    b_t b_t2 = dwC.K;
                    mY_ my_ = mY_.v;
                    Object obj = O2.R.get(b_t2);
                    if (obj == null) {
                        obj = my_.g();
                    }
                    jGVar.f4895R.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) obj).booleanValue()));
                }
            }
        }
    }

    public static final long R(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        int i = esE.R;
        return floatToIntBits2;
    }

    public static void S(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(jQ.C(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        n3x.y(gvP.class.getName(), classCastException);
        throw classCastException;
    }

    public static void U(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static String V(long j) {
        return l6.I(j, f3989R);
    }

    public static Collection X(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof dsi) || (abstractCollection instanceof oOL)) {
            return abstractCollection;
        }
        S(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static final boolean Y(oIb oib) {
        return (i(oib.O(), dwC.O) == null && i(oib.O(), dwC.X) == null) ? false : true;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:31:0x007c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [fcD] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean Z(java.util.ArrayList r11) {
        /*
            int r0 = r11.size()
            r1 = 1
            r2 = 2
            if (r0 >= r2) goto L_0x0009
            return r1
        L_0x0009:
            int r0 = r11.size()
            r2 = 0
            if (r0 == 0) goto L_0x007a
            int r0 = r11.size()
            if (r0 != r1) goto L_0x0017
            goto L_0x007a
        L_0x0017:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r3 = r11.get(r2)
            int r4 = defpackage.pdD.i(r11)
            r5 = r2
        L_0x0025:
            if (r5 >= r4) goto L_0x007c
            int r5 = r5 + 1
            java.lang.Object r6 = r11.get(r5)
            r7 = r6
            oIb r7 = (defpackage.oIb) r7
            oIb r3 = (defpackage.oIb) r3
            gIA r8 = r3.e()
            long r8 = r8.R()
            float r8 = defpackage.aWo.e(r8)
            gIA r9 = r7.e()
            long r9 = r9.R()
            float r9 = defpackage.aWo.e(r9)
            float r8 = r8 - r9
            float r8 = java.lang.Math.abs(r8)
            gIA r3 = r3.e()
            long r9 = r3.R()
            float r3 = defpackage.aWo.X(r9)
            gIA r7 = r7.e()
            long r9 = r7.R()
            float r7 = defpackage.aWo.X(r9)
            float r3 = r3 - r7
            float r3 = java.lang.Math.abs(r3)
            long r7 = defpackage.aH9.N(r8, r3)
            aWo r3 = new aWo
            r3.<init>(r7)
            r0.add(r3)
            r3 = r6
            goto L_0x0025
        L_0x007a:
            fcD r0 = defpackage.fcD.R
        L_0x007c:
            int r11 = r0.size()
            if (r11 != r1) goto L_0x008b
            java.lang.Object r11 = defpackage.dF.b(r0)
            aWo r11 = (defpackage.aWo) r11
            long r3 = r11.f906R
            goto L_0x00ba
        L_0x008b:
            boolean r11 = r0.isEmpty()
            if (r11 != 0) goto L_0x00c9
            java.lang.Object r11 = defpackage.dF.b(r0)
            int r3 = defpackage.pdD.i(r0)
            if (r1 > r3) goto L_0x00b6
            r4 = r1
        L_0x009c:
            java.lang.Object r5 = r0.get(r4)
            aWo r5 = (defpackage.aWo) r5
            long r5 = r5.f906R
            aWo r11 = (defpackage.aWo) r11
            long r7 = r11.f906R
            long r5 = defpackage.aWo.L(r7, r5)
            aWo r11 = new aWo
            r11.<init>(r5)
            if (r4 == r3) goto L_0x00b6
            int r4 = r4 + 1
            goto L_0x009c
        L_0x00b6:
            aWo r11 = (defpackage.aWo) r11
            long r3 = r11.f906R
        L_0x00ba:
            float r11 = defpackage.aWo.e(r3)
            float r0 = defpackage.aWo.X(r3)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r1 = r2
        L_0x00c8:
            return r1
        L_0x00c9:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Empty collection can't be reduced."
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvP.Z(java.util.ArrayList):boolean");
    }

    public static final void c(qc qcVar, fue fue) {
        long i = ooA.i(fue.f3600R.f4974R);
        int t = mLz.t(aWo.e(i));
        int t2 = mLz.t(aWo.X(i));
        qcVar.layout(t, t2, qcVar.getMeasuredWidth() + t, qcVar.getMeasuredHeight() + t2);
    }

    public static final ly1 e(cwX cwx) {
        return (ly1) cwx.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        if (r13 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0097 A[Catch: NumberFormatException -> 0x00bc, LOOP:3: B:26:0x006c->B:46:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:23:0x0059, B:26:0x006c, B:28:0x0072, B:33:0x0080, B:46:0x0097, B:48:0x009c, B:51:0x00ac, B:53:0x00b1), top: B:68:0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:23:0x0059, B:26:0x006c, B:28:0x0072, B:33:0x0080, B:46:0x0097, B:48:0x009c, B:51:0x00ac, B:53:0x00b1), top: B:68:0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ac A[Catch: NumberFormatException -> 0x00bc, TryCatch #0 {NumberFormatException -> 0x00bc, blocks: (B:23:0x0059, B:26:0x006c, B:28:0x0072, B:33:0x0080, B:46:0x0097, B:48:0x009c, B:51:0x00ac, B:53:0x00b1), top: B:68:0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0096 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.k6t[] g(java.lang.String r17) {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvP.g(java.lang.String):k6t[]");
    }

    public static Jv h() {
        return new Jv(null, 2);
    }

    public static final Object i(kEW kew, b_t b_t) {
        mY_ my_ = mY_.c;
        Object obj = kew.R.get(b_t);
        return obj == null ? my_.g() : obj;
    }

    public static final void j(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }

    public static boolean m(k6t[] k6tArr, k6t[] k6tArr2) {
        if (k6tArr == null || k6tArr2 == null || k6tArr.length != k6tArr2.length) {
            return false;
        }
        for (int i = 0; i < k6tArr.length; i++) {
            k6t k6t = k6tArr[i];
            char c2 = k6t.R;
            k6t k6t2 = k6tArr2[i];
            if (!(c2 == k6t2.R && k6t.f5199R.length == k6t2.f5199R.length)) {
                return false;
            }
        }
        return true;
    }

    public static final void n(jG jGVar, oIb oib) {
        li liVar = (li) i(oib.O(), dwC.O);
        if (liVar != null) {
            jGVar.f4895R.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(liVar.R, liVar.v, false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (i(oib.O(), dwC.X) != null) {
            List X2 = oib.X(false);
            int size = X2.size();
            for (int i = 0; i < size; i++) {
                oIb oib2 = (oIb) X2.get(i);
                if (oib2.O().R(dwC.K)) {
                    arrayList.add(oib2);
                }
            }
        }
        int i2 = 1;
        if (!arrayList.isEmpty()) {
            boolean Z2 = Z(arrayList);
            int size2 = Z2 ? 1 : arrayList.size();
            if (Z2) {
                i2 = arrayList.size();
            }
            jGVar.f4895R.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, i2, false, 0));
        }
    }

    public static final jy_ o(kvj kvj) {
        Object obj;
        HashMap hashMap = kvj.R;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = kvj.R.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
        }
        jy_ jy_ = (jy_) obj;
        if (jy_ != null) {
            return jy_;
        }
        pyX pyx = new pyX(null);
        h8R h8r = iFn.R;
        return (jy_) kvj.c(new VQ(jjU.t(pyx, ((hBL) hJr.R).f4160R)), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static k6t[] t(k6t[] k6tArr) {
        if (k6tArr == null) {
            return null;
        }
        k6t[] k6tArr2 = new k6t[k6tArr.length];
        for (int i = 0; i < k6tArr.length; i++) {
            k6tArr2[i] = new k6t(k6tArr[i]);
        }
        return k6tArr2;
    }

    public static void u(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final long v(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        int i = o2S.R;
        return floatToIntBits2;
    }

    public static void x(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static Path y(String str) {
        Path path = new Path();
        k6t[] g = g(str);
        if (g == null) {
            return null;
        }
        try {
            k6t.v(g, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException(opT.H("Error in parsing ", str), e2);
        }
    }

    public static final void z(eZV ezv, aOO aoo, boolean z) {
        Object L2 = ezv.L();
        Throwable e2 = ezv.e(L2);
        Object bvw = e2 != null ? new bvw(e2) : ezv.X(L2);
        if (z) {
            na6 na6 = (na6) aoo;
            aOO aoo2 = na6.f6468R;
            Object obj = na6.v;
            nbD v2 = aoo2.v();
            Object i = cU5.i(v2, obj);
            ho9 f = i != cU5.R ? l6.f(aoo2, v2, i) : null;
            try {
                na6.f6468R.Y(bvw);
            } finally {
                if (f == null || f.pG()) {
                    cU5.C(v2, i);
                }
            }
        } else {
            aoo.Y(bvw);
        }
    }

    public abstract void J(int i, dzb dzb);

    public abstract void K();
}
