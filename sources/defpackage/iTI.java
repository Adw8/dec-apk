package defpackage;

import android.app.Dialog;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.EdgeEffect;
import androidx.navigation.fragment.NavHostFragment;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: iTI  reason: default package */
/* loaded from: classes.dex */
public abstract class iTI {
    public static final dq R = new dq();

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f4603R = {R.attr.background, R.attr.backgroundSplit, R.attr.backgroundStacked, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.customNavigationLayout, R.attr.displayOptions, R.attr.divider, R.attr.elevation, R.attr.height, R.attr.hideOnContentScroll, R.attr.homeAsUpIndicator, R.attr.homeLayout, R.attr.icon, R.attr.indeterminateProgressStyle, R.attr.itemPadding, R.attr.logo, R.attr.navigationMode, R.attr.popupTheme, R.attr.progressBarPadding, R.attr.progressBarStyle, R.attr.subtitle, R.attr.subtitleTextStyle, R.attr.title, R.attr.titleTextStyle};
    public static final int[] v = {16842931};
    public static final int[] c = {16843071};
    public static final int[] e = {R.attr.background, R.attr.backgroundSplit, R.attr.closeItemLayout, R.attr.height, R.attr.subtitleTextStyle, R.attr.titleTextStyle};
    public static final int[] X = {16842994, R.attr.buttonIconDimen, R.attr.buttonPanelSideLayout, R.attr.listItemLayout, R.attr.listLayout, R.attr.multiChoiceItemLayout, R.attr.showTitle, R.attr.singleChoiceItemLayout};
    public static final int[] O = {16843033, R.attr.srcCompat, R.attr.tint, R.attr.tintMode};
    public static final int[] L = {16843074, R.attr.tickMark, R.attr.tickMarkTint, R.attr.tickMarkTintMode};
    public static final int[] Z = {16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667};
    public static final int[] m = {16842804, R.attr.autoSizeMaxTextSize, R.attr.autoSizeMinTextSize, R.attr.autoSizePresetSizes, R.attr.autoSizeStepGranularity, R.attr.autoSizeTextType, R.attr.drawableBottomCompat, R.attr.drawableEndCompat, R.attr.drawableLeftCompat, R.attr.drawableRightCompat, R.attr.drawableStartCompat, R.attr.drawableTint, R.attr.drawableTintMode, R.attr.drawableTopCompat, R.attr.emojiCompatEnabled, R.attr.firstBaselineToTopHeight, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.lastBaselineToBottomHeight, R.attr.lineHeight, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] x = {16842839, 16842926, R.attr.actionBarDivider, R.attr.actionBarItemBackground, R.attr.actionBarPopupTheme, R.attr.actionBarSize, R.attr.actionBarSplitStyle, R.attr.actionBarStyle, R.attr.actionBarTabBarStyle, R.attr.actionBarTabStyle, R.attr.actionBarTabTextStyle, R.attr.actionBarTheme, R.attr.actionBarWidgetTheme, R.attr.actionButtonStyle, R.attr.actionDropDownStyle, R.attr.actionMenuTextAppearance, R.attr.actionMenuTextColor, R.attr.actionModeBackground, R.attr.actionModeCloseButtonStyle, R.attr.actionModeCloseContentDescription, R.attr.actionModeCloseDrawable, R.attr.actionModeCopyDrawable, R.attr.actionModeCutDrawable, R.attr.actionModeFindDrawable, R.attr.actionModePasteDrawable, R.attr.actionModePopupWindowStyle, R.attr.actionModeSelectAllDrawable, R.attr.actionModeShareDrawable, R.attr.actionModeSplitBackground, R.attr.actionModeStyle, R.attr.actionModeTheme, R.attr.actionModeWebSearchDrawable, R.attr.actionOverflowButtonStyle, R.attr.actionOverflowMenuStyle, R.attr.activityChooserViewStyle, R.attr.alertDialogButtonGroupStyle, R.attr.alertDialogCenterButtons, R.attr.alertDialogStyle, R.attr.alertDialogTheme, R.attr.autoCompleteTextViewStyle, R.attr.borderlessButtonStyle, R.attr.buttonBarButtonStyle, R.attr.buttonBarNegativeButtonStyle, R.attr.buttonBarNeutralButtonStyle, R.attr.buttonBarPositiveButtonStyle, R.attr.buttonBarStyle, R.attr.buttonStyle, R.attr.buttonStyleSmall, R.attr.checkboxStyle, R.attr.checkedTextViewStyle, R.attr.colorAccent, R.attr.colorBackgroundFloating, R.attr.colorButtonNormal, R.attr.colorControlActivated, R.attr.colorControlHighlight, R.attr.colorControlNormal, R.attr.colorError, R.attr.colorPrimary, R.attr.colorPrimaryDark, R.attr.colorSwitchThumbNormal, R.attr.controlBackground, R.attr.dialogCornerRadius, R.attr.dialogPreferredPadding, R.attr.dialogTheme, R.attr.dividerHorizontal, R.attr.dividerVertical, R.attr.dropDownListViewStyle, R.attr.dropdownListPreferredItemHeight, R.attr.editTextBackground, R.attr.editTextColor, R.attr.editTextStyle, R.attr.homeAsUpIndicator, R.attr.imageButtonStyle, R.attr.listChoiceBackgroundIndicator, R.attr.listChoiceIndicatorMultipleAnimated, R.attr.listChoiceIndicatorSingleAnimated, R.attr.listDividerAlertDialog, R.attr.listMenuViewStyle, R.attr.listPopupWindowStyle, R.attr.listPreferredItemHeight, R.attr.listPreferredItemHeightLarge, R.attr.listPreferredItemHeightSmall, R.attr.listPreferredItemPaddingEnd, R.attr.listPreferredItemPaddingLeft, R.attr.listPreferredItemPaddingRight, R.attr.listPreferredItemPaddingStart, R.attr.panelBackground, R.attr.panelMenuListTheme, R.attr.panelMenuListWidth, R.attr.popupMenuStyle, R.attr.popupWindowStyle, R.attr.radioButtonStyle, R.attr.ratingBarStyle, R.attr.ratingBarStyleIndicator, R.attr.ratingBarStyleSmall, R.attr.searchViewStyle, R.attr.seekBarStyle, R.attr.selectableItemBackground, R.attr.selectableItemBackgroundBorderless, R.attr.spinnerDropDownItemStyle, R.attr.spinnerStyle, R.attr.switchStyle, R.attr.textAppearanceLargePopupMenu, R.attr.textAppearanceListItem, R.attr.textAppearanceListItemSecondary, R.attr.textAppearanceListItemSmall, R.attr.textAppearancePopupMenuHeader, R.attr.textAppearanceSearchResultSubtitle, R.attr.textAppearanceSearchResultTitle, R.attr.textAppearanceSmallPopupMenu, R.attr.textColorAlertDialogListItem, R.attr.textColorSearchUrl, R.attr.toolbarNavigationButtonStyle, R.attr.toolbarStyle, R.attr.tooltipForegroundColor, R.attr.tooltipFrameBackground, R.attr.viewInflaterClass, R.attr.windowActionBar, R.attr.windowActionBarOverlay, R.attr.windowActionModeOverlay, R.attr.windowFixedHeightMajor, R.attr.windowFixedHeightMinor, R.attr.windowFixedWidthMajor, R.attr.windowFixedWidthMinor, R.attr.windowMinWidthMajor, R.attr.windowMinWidthMinor, R.attr.windowNoTitle};
    public static final int[] H = {R.attr.allowStacking};
    public static final int[] U = {16843016, R.attr.checkMarkCompat, R.attr.checkMarkTint, R.attr.checkMarkTintMode};
    public static final int[] C = {16843015, R.attr.buttonCompat, R.attr.buttonTint, R.attr.buttonTintMode};
    public static final int[] N = {16842927, 16842948, 16843046, 16843047, 16843048, R.attr.divider, R.attr.dividerPadding, R.attr.measureWithLargestChild, R.attr.showDividers};
    public static final int[] P = {16843436, 16843437};
    public static final int[] j = {16842766, 16842960, 16843156, 16843230, 16843231, 16843232};
    public static final int[] g = {16842754, 16842766, 16842960, 16843014, 16843156, 16843230, 16843231, 16843233, 16843234, 16843235, 16843236, 16843237, 16843375, R.attr.actionLayout, R.attr.actionProviderClass, R.attr.actionViewClass, R.attr.alphabeticModifiers, R.attr.contentDescription, R.attr.iconTint, R.attr.iconTintMode, R.attr.numericModifiers, R.attr.showAsAction, R.attr.tooltipText};
    public static final int[] y = {16842926, 16843052, 16843053, 16843054, 16843055, 16843056, 16843057, R.attr.preserveIconSpacing, R.attr.subMenuArrow};
    public static final int[] t = {16843126, 16843465, R.attr.overlapAnchor};
    public static final int[] i = {R.attr.paddingBottomNoButtons, R.attr.paddingTopNoTitle};
    public static final int[] V = {16842970, 16843039, 16843296, 16843364, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.voiceIcon};
    public static final int[] o = {16842930, 16843126, 16843131, 16843362, R.attr.popupTheme};
    public static final int[] K = {16843044, 16843045, 16843074, R.attr.showText, R.attr.splitTrack, R.attr.switchMinWidth, R.attr.switchPadding, R.attr.switchTextAppearance, R.attr.thumbTextPadding, R.attr.thumbTint, R.attr.thumbTintMode, R.attr.track, R.attr.trackTint, R.attr.trackTintMode};
    public static final int[] J = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] Y = {16842927, 16843072, R.attr.buttonGravity, R.attr.collapseContentDescription, R.attr.collapseIcon, R.attr.contentInsetEnd, R.attr.contentInsetEndWithActions, R.attr.contentInsetLeft, R.attr.contentInsetRight, R.attr.contentInsetStart, R.attr.contentInsetStartWithNavigation, R.attr.logo, R.attr.logoDescription, R.attr.maxButtonHeight, R.attr.menu, R.attr.navigationContentDescription, R.attr.navigationIcon, R.attr.popupTheme, R.attr.subtitle, R.attr.subtitleTextAppearance, R.attr.subtitleTextColor, R.attr.title, R.attr.titleMargin, R.attr.titleMarginBottom, R.attr.titleMarginEnd, R.attr.titleMarginStart, R.attr.titleMarginTop, R.attr.titleMargins, R.attr.titleTextAppearance, R.attr.titleTextColor};
    public static final int[] h = {16842752, 16842970, R.attr.paddingEnd, R.attr.paddingStart, R.attr.theme};
    public static final int[] I = {16842964, R.attr.backgroundTint, R.attr.backgroundTintMode};
    public static final int[] u = {16842960, 16842994, 16842995};

    public static int C(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(opT.m("Could not convert ", i2, " to BackoffPolicy"));
    }

    public static ly1 H(View view) {
        ly1 ly1 = (ly1) view.getTag(R.id.view_tree_view_model_store_owner);
        if (ly1 != null) {
            return ly1;
        }
        ViewParent parent = view.getParent();
        while (ly1 == null && (parent instanceof View)) {
            View view2 = (View) parent;
            ly1 = (ly1) view2.getTag(R.id.view_tree_view_model_store_owner);
            parent = view2.getParent();
        }
        return ly1;
    }

    public static final long J(long j2) {
        return n1P.e((float) ((int) (j2 >> 32)), (float) ltH.v(j2));
    }

    public static int K(gDn gdn) {
        int ordinal = gdn.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i2 = 1;
        if (ordinal != 1) {
            i2 = 2;
            if (ordinal != 2) {
                i2 = 3;
                if (ordinal != 3) {
                    i2 = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + gdn + " to int");
                    }
                }
            }
        }
        return i2;
    }

    public static final poS L(fue fue) {
        j28 j28;
        poS pos;
        hUv B = aH9.B(fue);
        if (B == null) {
            B = aH9.l(fue);
        }
        return (B == null || (j28 = ((j28) B).R) == null || (pos = j28.f4791R) == null) ? fue.f3600R.f4974R : pos;
    }

    public static g_9 N(int i2) {
        if (i2 == 0) {
            return g_9.NOT_REQUIRED;
        }
        if (i2 == 1) {
            return g_9.CONNECTED;
        }
        if (i2 == 2) {
            return g_9.UNMETERED;
        }
        if (i2 == 3) {
            return g_9.NOT_ROAMING;
        }
        if (i2 == 4) {
            return g_9.METERED;
        }
        if (i2 == 5) {
            return g_9.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException(opT.m("Could not convert ", i2, " to NetworkType"));
    }

    public static View O(View view, int i2) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View findViewById = viewGroup.getChildAt(i3).findViewById(i2);
            if (findViewById != null) {
                return findViewById;
            }
        }
        return null;
    }

    public static int P(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(opT.m("Could not convert ", i2, " to OutOfQuotaPolicy"));
    }

    public static final long R(int i2, int i3) {
        return (((long) i3) & 4294967295L) | (((long) i2) << 32);
    }

    public static float U(EdgeEffect edgeEffect) {
        return VS.R.v(edgeEffect);
    }

    public static final void V(Spannable spannable, Object obj, int i2, int i3) {
        spannable.setSpan(obj, i2, i3, 33);
    }

    public static int X(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static final mpr Z(pm2 pm2) {
        Dialog dialog;
        Window window;
        int i2 = NavHostFragment.x;
        for (pm2 pm22 = pm2; pm22 != null; pm22 = pm22.f7254v) {
            if (pm22 instanceof NavHostFragment) {
                mpr mpr = ((NavHostFragment) pm22).R;
                if (mpr != null) {
                    return mpr;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
            pm2 pm23 = pm22.C().f4139v;
            if (pm23 instanceof NavHostFragment) {
                mpr mpr2 = ((NavHostFragment) pm23).R;
                if (mpr2 != null) {
                    return mpr2;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
            }
        }
        View view = pm2.f7228R;
        if (view != null) {
            return n3x.m(view);
        }
        View view2 = null;
        jcp jcp = pm2 instanceof jcp ? (jcp) pm2 : null;
        if (!(jcp == null || (dialog = jcp.f4978R) == null || (window = dialog.getWindow()) == null)) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return n3x.m(view2);
        }
        throw new IllegalStateException("Fragment " + pm2 + " does not have a NavController set");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
        jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 2, insn: 0x005c: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:28:0x005b
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
        	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
        	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
        	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
        */
    public static defpackage.b0y c(
/*
[112] Method generation error in method: iTI.c(byte[]):b0y, file: classes.dex
    jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:228)
    	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:195)
    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:151)
    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:344)
    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:302)
    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:271)
    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
    
*/

    public static final void e(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:113:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03b4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0190  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.jww g(int r41, defpackage.m88 r42) {
        /*
        // Method dump skipped, instructions count: 1162
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iTI.g(int, m88):jww");
    }

    public static final void i(SpannableString spannableString, long j2, jJj jjj, int i2, int i3) {
        long v2 = eT9.v(j2);
        if (lqt.R(v2, 4294967296L)) {
            V(spannableString, new AbsoluteSizeSpan(mLz.t(jjj.vz(j2)), false), i2, i3);
        } else if (lqt.R(v2, 8589934592L)) {
            V(spannableString, new RelativeSizeSpan(eT9.c(j2)), i2, i3);
        }
    }

    public static gDn j(int i2) {
        if (i2 == 0) {
            return gDn.ENQUEUED;
        }
        if (i2 == 1) {
            return gDn.RUNNING;
        }
        if (i2 == 2) {
            return gDn.SUCCEEDED;
        }
        if (i2 == 3) {
            return gDn.FAILED;
        }
        if (i2 == 4) {
            return gDn.BLOCKED;
        }
        if (i2 == 5) {
            return gDn.CANCELLED;
        }
        throw new IllegalArgumentException(opT.m("Could not convert ", i2, " to State"));
    }

    public static final fue m(fue fue, o1H o1h) {
        if (((Boolean) o1h.x(fue)).booleanValue()) {
            return fue;
        }
        List H2 = fue.H();
        int size = H2.size();
        for (int i2 = 0; i2 < size; i2++) {
            fue m2 = m((fue) H2.get(i2), o1h);
            if (m2 != null) {
                return m2;
            }
        }
        return null;
    }

    public static final String o(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        return name + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static final void t(SpannableString spannableString, long j2, int i2, int i3) {
        if (j2 != n3.O) {
            V(spannableString, new ForegroundColorSpan(aH9.vz(j2)), i2, i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0185, code lost:
        if (r3 == r6) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x019b, code lost:
        if (r3 == r6) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x019d, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x019f, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x026e, code lost:
        if (r4.f4584R == r6) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f6, code lost:
        if (r5.f4584R == r6) goto L_0x00fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x043e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x04a4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x058a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x065e  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0693  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x06a6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x06b2  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x06b4  */
    /* JADX WARNING: Removed duplicated region for block: B:390:0x06bf  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x06c2  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x06c8  */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x06cf  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x06df  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x06e3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0702 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x057e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void v(defpackage.m_b r36, defpackage.fhh r37, java.util.ArrayList r38, int r39) {
        /*
        // Method dump skipped, instructions count: 1808
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iTI.v(m_b, fhh, java.util.ArrayList, int):void");
    }

    public static final void x(fue fue, List list) {
        ArrayList arrayList;
        if (fue.K()) {
            ArrayList arrayList2 = new ArrayList();
            List H2 = fue.H();
            int size = H2.size();
            for (int i2 = 0; i2 < size; i2++) {
                fue fue2 = (fue) H2.get(i2);
                if (fue2.K()) {
                    arrayList2.add(new nxB(fue, fue2));
                }
            }
            try {
                nxB.e = 1;
                arrayList = new ArrayList(arrayList2);
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList);
                }
            } catch (IllegalArgumentException unused) {
                nxB.e = 2;
                arrayList = new ArrayList(arrayList2);
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList);
                }
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(((nxB) arrayList.get(i3)).v);
            }
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                fue fue3 = (fue) arrayList3.get(i4);
                hUv l = aH9.l(fue3);
                if (l != null) {
                    list.add(l);
                } else {
                    x(fue3, list);
                }
            }
        }
    }

    public static final float y(long j2, float f, jJj jjj) {
        long v2 = eT9.v(j2);
        if (lqt.R(v2, 4294967296L)) {
            return jjj.vz(j2);
        }
        if (lqt.R(v2, 8589934592L)) {
            return eT9.c(j2) * f;
        }
        return Float.NaN;
    }
}
