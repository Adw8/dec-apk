package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import dev.kdrag0n.virtcontainer.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECField;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import javax.crypto.KeyAgreement;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: hDC  reason: default package */
/* loaded from: classes.dex */
public abstract class hDC {
    public static final int[] R = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};
    public static final int[] v = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};
    public static final int[] c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};
    public static final int[] e = {16842755, 16843781, 16844062};
    public static final int[] X = {16843161};
    public static final int[] O = {16842755, 16843213};
    public static final int[] L = {16842964, 16843919, 16844096, R.attr.elevation, R.attr.expanded, R.attr.liftOnScroll, R.attr.liftOnScrollTargetViewId, R.attr.statusBarForeground};
    public static final int[] Z = {R.attr.layout_scrollEffect, R.attr.layout_scrollFlags, R.attr.layout_scrollInterpolator};
    public static final int[] m = {16843039, 16843040, 16843840, R.attr.backgroundTint, R.attr.behavior_draggable, R.attr.behavior_expandedOffset, R.attr.behavior_fitToContents, R.attr.behavior_halfExpandedRatio, R.attr.behavior_hideable, R.attr.behavior_peekHeight, R.attr.behavior_saveFlags, R.attr.behavior_skipCollapsed, R.attr.gestureInsetBottomIgnored, R.attr.marginLeftSystemWindowInsets, R.attr.marginRightSystemWindowInsets, R.attr.marginTopSystemWindowInsets, R.attr.paddingBottomSystemWindowInsets, R.attr.paddingLeftSystemWindowInsets, R.attr.paddingRightSystemWindowInsets, R.attr.paddingTopSystemWindowInsets, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] x = {16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardPreventCornerOverlap, R.attr.cardUseCompatPadding, R.attr.contentPadding, R.attr.contentPaddingBottom, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop};
    public static final int[] H = {16842804, 16842901, 16842904, 16842923, 16843039, 16843087, 16843237, R.attr.checkedIcon, R.attr.checkedIconEnabled, R.attr.checkedIconTint, R.attr.checkedIconVisible, R.attr.chipBackgroundColor, R.attr.chipCornerRadius, R.attr.chipEndPadding, R.attr.chipIcon, R.attr.chipIconEnabled, R.attr.chipIconSize, R.attr.chipIconTint, R.attr.chipIconVisible, R.attr.chipMinHeight, R.attr.chipMinTouchTargetSize, R.attr.chipStartPadding, R.attr.chipStrokeColor, R.attr.chipStrokeWidth, R.attr.chipSurfaceColor, R.attr.closeIcon, R.attr.closeIconEnabled, R.attr.closeIconEndPadding, R.attr.closeIconSize, R.attr.closeIconStartPadding, R.attr.closeIconTint, R.attr.closeIconVisible, R.attr.ensureMinTouchTargetSize, R.attr.hideMotionSpec, R.attr.iconEndPadding, R.attr.iconStartPadding, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.showMotionSpec, R.attr.textEndPadding, R.attr.textStartPadding};
    public static final int[] U = {R.attr.clockFaceBackgroundColor, R.attr.clockNumberTextColor};
    public static final int[] C = {R.attr.clockHandColor, R.attr.materialCircleRadius, R.attr.selectorSize};
    public static final int[] N = {R.attr.collapsedTitleGravity, R.attr.collapsedTitleTextAppearance, R.attr.collapsedTitleTextColor, R.attr.contentScrim, R.attr.expandedTitleGravity, R.attr.expandedTitleMargin, R.attr.expandedTitleMarginBottom, R.attr.expandedTitleMarginEnd, R.attr.expandedTitleMarginStart, R.attr.expandedTitleMarginTop, R.attr.expandedTitleTextAppearance, R.attr.expandedTitleTextColor, R.attr.extraMultilineHeightEnabled, R.attr.forceApplySystemWindowInsetTop, R.attr.maxLines, R.attr.scrimAnimationDuration, R.attr.scrimVisibleHeightTrigger, R.attr.statusBarScrim, R.attr.title, R.attr.titleCollapseMode, R.attr.titleEnabled, R.attr.titlePositionInterpolator, R.attr.titleTextEllipsize, R.attr.toolbarId};
    public static final int[] P = {R.attr.layout_collapseMode, R.attr.layout_collapseParallaxMultiplier};
    public static final int[] j = {R.attr.behavior_autoHide, R.attr.behavior_autoShrink};
    public static final int[] g = {R.attr.behavior_autoHide};
    public static final int[] y = {16843017, 16843264, R.attr.foregroundInsidePadding};
    public static final int[] t = {16843296, 16843916, R.attr.simpleItemLayout, R.attr.simpleItemSelectedColor, R.attr.simpleItemSelectedRippleColor, R.attr.simpleItems};
    public static final int[] i = {16842964, 16843191, 16843192, 16843193, 16843194, 16843237, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.cornerRadius, R.attr.elevation, R.attr.icon, R.attr.iconGravity, R.attr.iconPadding, R.attr.iconSize, R.attr.iconTint, R.attr.iconTintMode, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.strokeColor, R.attr.strokeWidth, R.attr.toggleCheckedStateOnClick};
    public static final int[] V = {R.attr.checkedButton, R.attr.selectionRequired, R.attr.singleSelection};
    public static final int[] o = {16843277, R.attr.dayInvalidStyle, R.attr.daySelectedStyle, R.attr.dayStyle, R.attr.dayTodayStyle, R.attr.nestedScrollable, R.attr.rangeFillColor, R.attr.yearSelectedStyle, R.attr.yearStyle, R.attr.yearTodayStyle};
    public static final int[] K = {16843191, 16843192, 16843193, 16843194, R.attr.itemFillColor, R.attr.itemShapeAppearance, R.attr.itemShapeAppearanceOverlay, R.attr.itemStrokeColor, R.attr.itemStrokeWidth, R.attr.itemTextColor};
    public static final int[] J = {16843237, R.attr.cardForegroundColor, R.attr.checkedIcon, R.attr.checkedIconGravity, R.attr.checkedIconMargin, R.attr.checkedIconSize, R.attr.checkedIconTint, R.attr.rippleColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.state_dragged, R.attr.strokeColor, R.attr.strokeWidth};
    public static final int[] Y = {16843015, R.attr.buttonCompat, R.attr.buttonIcon, R.attr.buttonIconTint, R.attr.buttonIconTintMode, R.attr.buttonTint, R.attr.centerIfNoTextEnabled, R.attr.checkedState, R.attr.errorAccessibilityLabel, R.attr.errorShown, R.attr.useMaterialThemeColors};
    public static final int[] h = {R.attr.buttonTint, R.attr.useMaterialThemeColors};
    public static final int[] I = {R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] u = {R.attr.thumbIcon, R.attr.thumbIconTint, R.attr.thumbIconTintMode, R.attr.trackDecoration, R.attr.trackDecorationTint, R.attr.trackDecorationTintMode};
    public static final int[] z = {16843958, 16844159, R.attr.lineHeight};
    public static final int[] n = {16842804, 16844159, R.attr.lineHeight};
    public static final int[] Q = {R.attr.logoAdjustViewBounds, R.attr.logoScaleType, R.attr.navigationIconTint, R.attr.subtitleCentered, R.attr.titleCentered};
    public static final int[] A = {R.attr.materialCircleRadius};
    public static final int[] S = {R.attr.behavior_overlapTop};
    public static final int[] d = {R.attr.cornerFamily, R.attr.cornerFamilyBottomLeft, R.attr.cornerFamilyBottomRight, R.attr.cornerFamilyTopLeft, R.attr.cornerFamilyTopRight, R.attr.cornerSize, R.attr.cornerSizeBottomLeft, R.attr.cornerSizeBottomRight, R.attr.cornerSizeTopLeft, R.attr.cornerSizeTopRight};
    public static final int[] W = {16842766, 16842788, 16843078, 16843486, 16843487, R.attr.haloColor, R.attr.haloRadius, R.attr.labelBehavior, R.attr.labelStyle, R.attr.thumbColor, R.attr.thumbElevation, R.attr.thumbRadius, R.attr.thumbStrokeColor, R.attr.thumbStrokeWidth, R.attr.tickColor, R.attr.tickColorActive, R.attr.tickColorInactive, R.attr.tickVisible, R.attr.trackColor, R.attr.trackColorActive, R.attr.trackColorInactive, R.attr.trackHeight};
    public static final int[] s = {16843039, R.attr.actionTextColorAlpha, R.attr.animationMode, R.attr.backgroundOverlayColorAlpha, R.attr.backgroundTint, R.attr.backgroundTintMode, R.attr.elevation, R.attr.maxActionInlineWidth, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay};
    public static final int[] T = {R.attr.useMaterialThemeColors};
    public static final int[] r = {16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, R.attr.fontFamily, R.attr.fontVariationSettings, R.attr.textAllCaps, R.attr.textLocale};
    public static final int[] k = {R.attr.textInputLayoutFocusedRectEnabled};
    public static final int[] p = {16842766, 16842906, 16843039, 16843071, 16843088, 16843095, 16843098, R.attr.boxBackgroundColor, R.attr.boxBackgroundMode, R.attr.boxCollapsedPaddingTop, R.attr.boxCornerRadiusBottomEnd, R.attr.boxCornerRadiusBottomStart, R.attr.boxCornerRadiusTopEnd, R.attr.boxCornerRadiusTopStart, R.attr.boxStrokeColor, R.attr.boxStrokeErrorColor, R.attr.boxStrokeWidth, R.attr.boxStrokeWidthFocused, R.attr.counterEnabled, R.attr.counterMaxLength, R.attr.counterOverflowTextAppearance, R.attr.counterOverflowTextColor, R.attr.counterTextAppearance, R.attr.counterTextColor, R.attr.endIconCheckable, R.attr.endIconContentDescription, R.attr.endIconDrawable, R.attr.endIconMode, R.attr.endIconTint, R.attr.endIconTintMode, R.attr.errorContentDescription, R.attr.errorEnabled, R.attr.errorIconDrawable, R.attr.errorIconTint, R.attr.errorIconTintMode, R.attr.errorTextAppearance, R.attr.errorTextColor, R.attr.expandedHintEnabled, R.attr.helperText, R.attr.helperTextEnabled, R.attr.helperTextTextAppearance, R.attr.helperTextTextColor, R.attr.hintAnimationEnabled, R.attr.hintEnabled, R.attr.hintTextAppearance, R.attr.hintTextColor, R.attr.passwordToggleContentDescription, R.attr.passwordToggleDrawable, R.attr.passwordToggleEnabled, R.attr.passwordToggleTint, R.attr.passwordToggleTintMode, R.attr.placeholderText, R.attr.placeholderTextAppearance, R.attr.placeholderTextColor, R.attr.prefixText, R.attr.prefixTextAppearance, R.attr.prefixTextColor, R.attr.shapeAppearance, R.attr.shapeAppearanceOverlay, R.attr.startIconCheckable, R.attr.startIconContentDescription, R.attr.startIconDrawable, R.attr.startIconTint, R.attr.startIconTintMode, R.attr.suffixText, R.attr.suffixTextAppearance, R.attr.suffixTextColor};
    public static final int[] G = {16842804, R.attr.enforceMaterialTheme, R.attr.enforceTextAppearance};
    public static final int[] B = {16842804, 16842904, 16842965, 16842998, 16843071, 16843072, 16843087, R.attr.backgroundTint};

    public static byte[] A(EllipticCurve ellipticCurve, int i2, ECPoint eCPoint) {
        O(eCPoint, ellipticCurve);
        int bitLength = (y(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        if (i2 != 0) {
            int i3 = i2 - 1;
            if (i3 != 0) {
                int i4 = 2;
                if (i3 == 1) {
                    int i5 = bitLength + 1;
                    byte[] bArr = new byte[i5];
                    byte[] byteArray = eCPoint.getAffineX().toByteArray();
                    System.arraycopy(byteArray, 0, bArr, i5 - byteArray.length, byteArray.length);
                    if (eCPoint.getAffineY().testBit(0)) {
                        i4 = 3;
                    }
                    bArr[0] = (byte) i4;
                    return bArr;
                } else if (i3 == 2) {
                    int i6 = bitLength * 2;
                    byte[] bArr2 = new byte[i6];
                    byte[] byteArray2 = eCPoint.getAffineX().toByteArray();
                    if (byteArray2.length > bitLength) {
                        byteArray2 = Arrays.copyOfRange(byteArray2, byteArray2.length - bitLength, byteArray2.length);
                    }
                    byte[] byteArray3 = eCPoint.getAffineY().toByteArray();
                    if (byteArray3.length > bitLength) {
                        byteArray3 = Arrays.copyOfRange(byteArray3, byteArray3.length - bitLength, byteArray3.length);
                    }
                    System.arraycopy(byteArray3, 0, bArr2, i6 - byteArray3.length, byteArray3.length);
                    System.arraycopy(byteArray2, 0, bArr2, bitLength - byteArray2.length, byteArray2.length);
                    return bArr2;
                } else {
                    StringBuilder U2 = opT.U("invalid format:");
                    U2.append(jQ.n(i2));
                    throw new GeneralSecurityException(U2.toString());
                }
            } else {
                int i7 = (bitLength * 2) + 1;
                byte[] bArr3 = new byte[i7];
                byte[] byteArray4 = eCPoint.getAffineX().toByteArray();
                byte[] byteArray5 = eCPoint.getAffineY().toByteArray();
                System.arraycopy(byteArray5, 0, bArr3, i7 - byteArray5.length, byteArray5.length);
                System.arraycopy(byteArray4, 0, bArr3, (bitLength + 1) - byteArray4.length, byteArray4.length);
                bArr3[0] = 4;
                return bArr3;
            }
        } else {
            throw null;
        }
    }

    public static PendingIntent B(Intent intent, Service service, int i2) {
        return PendingIntent.getActivity(service, i2, intent, 201326592);
    }

    public static Object C(Class cls, Object obj) {
        if (obj instanceof gwr) {
            return cls.cast(obj);
        }
        if (obj instanceof iLf) {
            return C(cls, ((iLf) obj).R());
        }
        throw new IllegalStateException(String.format("Given component holder %s does not implement %s or %s", obj.getClass(), gwr.class, iLf.class));
    }

    public static void D(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(w(i2, i3, "index"));
        }
    }

    public static void E(jhs jhs) {
        P(p(jhs.o().t()));
        G(jhs.o().V());
        if (jhs.V() != ljd.UNKNOWN_FORMAT) {
            kWP.X(jhs.i().g());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static void F(int i2, int i3) {
        String str;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                str = lTs.n("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else if (i3 < 0) {
                throw new IllegalArgumentException(opT.Z("negative size: ", i3));
            } else {
                str = lTs.n("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static String G(clj clj) {
        int ordinal = clj.ordinal();
        if (ordinal == 1) {
            return "HmacSha1";
        }
        if (ordinal == 2) {
            return "HmacSha384";
        }
        if (ordinal == 3) {
            return "HmacSha256";
        }
        if (ordinal == 4) {
            return "HmacSha512";
        }
        if (ordinal == 5) {
            return "HmacSha224";
        }
        throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + clj);
    }

    public static ift H() {
        return new ift(0);
    }

    public static boolean I(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final iWK J(nbD nbd) {
        iWK iwk = (iWK) nbd.O(iWK.R);
        if (iwk != null) {
            return iwk;
        }
        throw new IllegalStateException("No RetryStatus in context".toString());
    }

    public static ECParameterSpec K(String str, String str2, String str3, String str4, String str5) {
        BigInteger bigInteger = new BigInteger(str);
        return new ECParameterSpec(new EllipticCurve(new ECFieldFp(bigInteger), bigInteger.subtract(new BigInteger("3")), new BigInteger(str3, 16)), new ECPoint(new BigInteger(str4, 16), new BigInteger(str5, 16)), new BigInteger(str2), 1);
    }

    public static void L(boolean z2, String str, Object... objArr) {
        if (!z2) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static String M(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return "None";
        }
        if (i2 == 1) {
            return "Characters";
        }
        if (i2 == 2) {
            return "Words";
        }
        if (i2 == 3) {
            z2 = true;
        }
        return z2 ? "Sentences" : "Invalid";
    }

    public static int N(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static void O(ECPoint eCPoint, EllipticCurve ellipticCurve) {
        BigInteger y2 = y(ellipticCurve);
        BigInteger affineX = eCPoint.getAffineX();
        BigInteger affineY = eCPoint.getAffineY();
        if (affineX == null || affineY == null) {
            throw new GeneralSecurityException("point is at infinity");
        } else if (affineX.signum() == -1 || affineX.compareTo(y2) >= 0) {
            throw new GeneralSecurityException("x is out of range");
        } else if (affineY.signum() == -1 || affineY.compareTo(y2) >= 0) {
            throw new GeneralSecurityException("y is out of range");
        } else if (!affineY.multiply(affineY).mod(y2).equals(affineX.multiply(affineX).add(ellipticCurve.getA()).multiply(affineX).add(ellipticCurve.getB()).mod(y2))) {
            throw new GeneralSecurityException("Point is not on curve");
        }
    }

    public static ECParameterSpec P(k_8 k_8) {
        int ordinal = k_8.ordinal();
        if (ordinal == 0) {
            return K("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        }
        if (ordinal == 1) {
            return K("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
        }
        if (ordinal == 2) {
            return K("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        }
        throw new NoSuchAlgorithmException("curve not implemented:" + k_8);
    }

    public static void Q(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j2);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static final void R(jww jww, String str, m88 m88, int i2) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-530153955);
        RJ.R(eDQ.R, luB.R, null, null, aH9.I(jr_, 1742905842, new bkx(7, jww)), aH9.I(jr_, -570899375, new cMF(str, i2, 2)), luB.v, null, 0, 0, 0, 0, 0.0f, null, jr_, 1794102, 0, 16268);
        dYh t2 = jr_.t();
        if (t2 != null) {
            t2.f2666R = new _a(jww, str, i2, 12);
        }
    }

    public static int S(File file) {
        AbstractInterruptibleChannel abstractInterruptibleChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60, 4, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i2 = allocate.getInt();
                channel.close();
                return i2;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (0 != 0) {
                abstractInterruptibleChannel.close();
            }
            throw th;
        }
    }

    public static final kMk T(kMk kmk, mdz mdz) {
        eBF ebf = kmk.f5283R;
        int i2 = gaA.R;
        o3t o3t = ebf.f3019R;
        mY_ my_ = mY_.e;
        o3t.getClass();
        if (n3x.v(o3t, kVu.R)) {
            o3t = (o3t) my_.g();
        }
        long j2 = gQc.T(ebf.R) ? gaA.f3795R : ebf.R;
        lIe lie = ebf.f3017R;
        if (lie == null) {
            lie = lIe.e;
        }
        ned ned = ebf.f3018R;
        boolean z2 = false;
        ned ned2 = new ned(ned != null ? ned.R : 0);
        hqI hqi = ebf.f3015R;
        hqI hqi2 = new hqI(hqi != null ? hqi.R : 1);
        deI dei = ebf.f3012R;
        if (dei == null) {
            dei = deI.R;
        }
        String str = ebf.f3016R;
        if (str == null) {
            str = "";
        }
        long j3 = gQc.T(ebf.v) ? gaA.v : ebf.v;
        L0 l0 = ebf.f3008R;
        L0 l02 = new L0(l0 != null ? l0.R : 0.0f);
        h5a h5a = ebf.f3013R;
        if (h5a == null) {
            h5a = h5a.R;
        }
        d5E d5e = ebf.f3011R;
        if (d5e == null) {
            d5e = hw1.t();
        }
        long j4 = ebf.c;
        if (!(j4 != n3.O)) {
            j4 = gaA.c;
        }
        ari ari = ebf.f3009R;
        if (ari == null) {
            ari = ari.R;
        }
        hpO hpo = ebf.f3014R;
        if (hpo == null) {
            hpo = hpO.R;
        }
        eBF ebf2 = new eBF(o3t, j2, lie, ned2, hqi2, dei, str, j3, l02, h5a, d5e, j4, ari, hpo, ebf.f3010R);
        kne kne = kmk.f5284R;
        int i3 = iIn.R;
        pvy pvy = kne.f5429R;
        int i4 = 5;
        pvy pvy2 = new pvy(pvy != null ? pvy.R : 5);
        cF0 cf0 = kne.f5423R;
        if (cf0 != null && cf0.R == 3) {
            z2 = true;
        }
        if (z2) {
            int ordinal = mdz.ordinal();
            if (ordinal == 0) {
                i4 = 4;
            } else if (ordinal != 1) {
                throw new j8f((Object) null);
            }
        } else if (cf0 == null) {
            int ordinal2 = mdz.ordinal();
            if (ordinal2 == 0) {
                i4 = 1;
            } else if (ordinal2 == 1) {
                i4 = 2;
            } else {
                throw new j8f((Object) null);
            }
        } else {
            i4 = cf0.R;
        }
        cF0 cf02 = new cF0(i4);
        long j5 = gQc.T(kne.R) ? iIn.f4534R : kne.R;
        mRi mri = kne.f5428R;
        if (mri == null) {
            mri = mRi.R;
        }
        gvH gvh = kne.f5425R;
        erS ers = kne.f5424R;
        h4c h4c = kne.f5426R;
        if (h4c == null) {
            h4c = h4c.R;
        }
        hF1 hf1 = kne.f5427R;
        if (hf1 == null) {
            hf1 = hF1.R;
        }
        return new kMk(ebf2, new kne(pvy2, cf02, j5, mri, gvh, ers, h4c, hf1), kmk.f5282R);
    }

    public static KeyPair U(ECParameterSpec eCParameterSpec) {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) aXa.e.R("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static float V(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, float f) {
        return !I(xmlPullParser, str) ? f : typedArray.getFloat(i2, f);
    }

    public static TypedValue W(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final Bundle X(kSh... kshArr) {
        Bundle bundle = new Bundle(kshArr.length);
        for (kSh ksh : kshArr) {
            String str = (String) ksh.R;
            Object obj = ksh.v;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                pb.R(bundle, str, (IBinder) obj);
            } else if (obj instanceof Size) {
                A8.R(bundle, str, (Size) obj);
            } else if (obj instanceof SizeF) {
                A8.v(bundle, str, (SizeF) obj);
            } else {
                throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
            }
        }
        return bundle;
    }

    public static String Y(TypedArray typedArray, int i2, int i3) {
        String string = typedArray.getString(i2);
        return string == null ? typedArray.getString(i3) : string;
    }

    public static byte[] Z(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        f(eCPrivateKey, eCPublicKey);
        ECPoint w = eCPublicKey.getW();
        O(w, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) aXa.X.R("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) aXa.c.R("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(y(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            h(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static int a(int i2, byte[] bArr) {
        return ((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255);
    }

    public static void b(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? w(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? w(i3, i4, "end index") : lTs.n("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static final void c(m88 m88, int i2) {
        jr_ jr_ = (jr_) m88;
        jr_.q(1048183858);
        if (i2 != 0 || !jr_.J()) {
            cpc.N(R.string.onboarding_adb_dev_options_message, new String[]{cUF.Z((Context) jr_.x(ur.f7428R))}, jr_, 64);
        } else {
            jr_.E();
        }
        dYh t2 = jr_.t();
        if (t2 != null) {
            t2.f2666R = new Hg(i2, 0);
        }
    }

    public static final Object d(aLd ald, iMP imp, iv7 iv7, aOO aoo) {
        Object L2;
        if (imp != iMP.INITIALIZED) {
            return (((m4i) ald).f5900R != iMP.DESTROYED && (L2 = jjU.L(new iLl(ald, imp, iv7, null), aoo)) == bGR.COROUTINE_SUSPENDED) ? L2 : o8s.R;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    public static final im e(LG lg, aLd ald) {
        if (((m4i) ald).f5900R.compareTo(iMP.DESTROYED) > 0) {
            pkq pkq = new pkq(0, lg);
            ald.R(pkq);
            return new im(ald, 3, pkq);
        }
        throw new IllegalStateException(("Cannot configure " + lg + " to disposeComposition at Lifecycle ON_DESTROY: " + ald + "is already destroyed").toString());
    }

    public static void f(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) {
        try {
            if (!u(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }

    public static ECPublicKey g(k_8 k_8, byte[] bArr) {
        ECPoint eCPoint;
        ECParameterSpec P2 = P(k_8);
        EllipticCurve curve = P2.getCurve();
        int bitLength = (y(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        int I2 = jQ.I(1);
        boolean z2 = false;
        if (I2 != 0) {
            if (I2 == 1) {
                BigInteger y2 = y(curve);
                if (bArr.length == bitLength + 1) {
                    byte b = bArr[0];
                    if (b != 2) {
                        if (b == 3) {
                            z2 = true;
                        } else {
                            throw new GeneralSecurityException("invalid format");
                        }
                    }
                    BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                    if (bigInteger.signum() == -1 || bigInteger.compareTo(y2) >= 0) {
                        throw new GeneralSecurityException("x is out of range");
                    }
                    eCPoint = new ECPoint(bigInteger, h(bigInteger, z2, curve));
                } else {
                    throw new GeneralSecurityException("compressed point has wrong length");
                }
            } else if (I2 != 2) {
                StringBuilder U2 = opT.U("invalid format:");
                U2.append(jQ.n(1));
                throw new GeneralSecurityException(U2.toString());
            } else if (bArr.length == bitLength * 2) {
                eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, bitLength)), new BigInteger(1, Arrays.copyOfRange(bArr, bitLength, bArr.length)));
                O(eCPoint, curve);
            } else {
                throw new GeneralSecurityException("invalid point size");
            }
        } else if (bArr.length != (bitLength * 2) + 1) {
            throw new GeneralSecurityException("invalid point size");
        } else if (bArr[0] == 4) {
            int i2 = bitLength + 1;
            eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i2)), new BigInteger(1, Arrays.copyOfRange(bArr, i2, bArr.length)));
            O(eCPoint, curve);
        } else {
            throw new GeneralSecurityException("invalid point format");
        }
        return (ECPublicKey) ((KeyFactory) aXa.X.R("EC")).generatePublic(new ECPublicKeySpec(eCPoint, P2));
    }

    public static BigInteger h(BigInteger bigInteger, boolean z2, EllipticCurve ellipticCurve) {
        BigInteger y2 = y(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(y2);
        if (y2.signum() == 1) {
            BigInteger mod2 = mod.mod(y2);
            BigInteger bigInteger2 = null;
            bigInteger2 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger2)) {
                if (y2.testBit(0) && y2.testBit(1)) {
                    bigInteger2 = mod2.modPow(y2.add(BigInteger.ONE).shiftRight(2), y2);
                } else if (y2.testBit(0) && !y2.testBit(1)) {
                    bigInteger2 = BigInteger.ONE;
                    BigInteger shiftRight = y2.subtract(bigInteger2).shiftRight(1);
                    int i2 = 0;
                    while (true) {
                        BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(y2);
                        if (mod3.equals(BigInteger.ZERO)) {
                            break;
                        }
                        BigInteger modPow = mod3.modPow(shiftRight, y2);
                        BigInteger bigInteger3 = BigInteger.ONE;
                        if (modPow.add(bigInteger3).equals(y2)) {
                            BigInteger shiftRight2 = y2.add(bigInteger3).shiftRight(1);
                            BigInteger bigInteger4 = bigInteger2;
                            for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                BigInteger multiply = bigInteger4.multiply(bigInteger3);
                                bigInteger4 = bigInteger4.multiply(bigInteger4).add(bigInteger3.multiply(bigInteger3).mod(y2).multiply(mod3)).mod(y2);
                                BigInteger mod4 = multiply.add(multiply).mod(y2);
                                if (shiftRight2.testBit(bitLength)) {
                                    bigInteger4 = bigInteger4.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(y2);
                                    bigInteger3 = bigInteger2.multiply(mod4).add(bigInteger4).mod(y2);
                                } else {
                                    bigInteger3 = mod4;
                                }
                            }
                            bigInteger2 = bigInteger4;
                        } else if (modPow.equals(bigInteger3)) {
                            bigInteger2 = bigInteger2.add(bigInteger3);
                            i2++;
                            if (i2 == 128 && !y2.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        } else {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    }
                }
                if (!(bigInteger2 == null || bigInteger2.multiply(bigInteger2).mod(y2).compareTo(mod2) == 0)) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
            return z2 != bigInteger2.testBit(0) ? y2.subtract(bigInteger2).mod(y2) : bigInteger2;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static mAv i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        mAv mav;
        if (I(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new mAv((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                mav = mAv.R(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                mav = null;
            }
            if (mav != null) {
                return mav;
            }
        }
        return new mAv((Shader) null, (ColorStateList) null, 0);
    }

    public static ECPrivateKey j(k_8 k_8, byte[] bArr) {
        return (ECPrivateKey) ((KeyFactory) aXa.X.R("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), P(k_8)));
    }

    public static void k(View view, c18 c18) {
        fBr fbr = c18.f1920R.f6908R;
        if (fbr != null && fbr.f3352R) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = of5.f6887R;
                f += m18.m((View) parent);
            }
            oku oku = c18.f1920R;
            if (oku.e != f) {
                oku.e = f;
                c18.i();
            }
        }
    }

    public static int l(ljd ljd) {
        int ordinal = ljd.ordinal();
        int i2 = 1;
        if (ordinal != 1) {
            i2 = 2;
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return 3;
                }
                throw new GeneralSecurityException("unknown point format: " + ljd);
            }
        }
        return i2;
    }

    public static int m(byte[] bArr, int i2, int i3) {
        int i4;
        int i5 = 0;
        while (true) {
            i4 = i2 + i5;
            if (i4 >= i3 || bArr[i4] != 0) {
                break;
            }
            i5++;
        }
        return (bArr[i4] & 255) > 127 ? i5 - 1 : i5;
    }

    public static TypedArray n(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static int o(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !I(xmlPullParser, str) ? i3 : typedArray.getInt(i2, i3);
    }

    public static k_8 p(giU giu) {
        int ordinal = giu.ordinal();
        if (ordinal == 1) {
            return k_8.NIST_P256;
        }
        if (ordinal == 2) {
            return k_8.NIST_P384;
        }
        if (ordinal == 3) {
            return k_8.NIST_P521;
        }
        throw new GeneralSecurityException("unknown curve type: " + giu);
    }

    public static TypedValue r(int i2, Context context, String str) {
        TypedValue W2 = W(context, i2);
        if (W2 != null) {
            return W2;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static boolean s(Context context, int i2, boolean z2) {
        TypedValue W2 = W(context, i2);
        return (W2 == null || W2.type != 18) ? z2 : W2.data != 0;
    }

    public static ColorStateList t(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!I(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i2 = typedValue.type;
        if (i2 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        } else if (i2 >= 28 && i2 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        } else {
            Resources resources = typedArray.getResources();
            int resourceId = typedArray.getResourceId(1, 0);
            ThreadLocal threadLocal = p1.R;
            try {
                return p1.R(resources, resources.getXml(resourceId), theme);
            } catch (Exception e2) {
                Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                return null;
            }
        }
    }

    public static boolean u(ECParameterSpec eCParameterSpec, ECParameterSpec eCParameterSpec2) {
        return eCParameterSpec.getCurve().equals(eCParameterSpec2.getCurve()) && eCParameterSpec.getGenerator().equals(eCParameterSpec2.getGenerator()) && eCParameterSpec.getOrder().equals(eCParameterSpec2.getOrder()) && eCParameterSpec.getCofactor() == eCParameterSpec2.getCofactor();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(java.lang.String r25, defpackage.mpr r26, defpackage.iv7 r27, defpackage.lR3 r28, defpackage.iv7 r29, defpackage.lR3 r30, defpackage.m88 r31, int r32, int r33) {
        /*
        // Method dump skipped, instructions count: 421
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hDC.v(java.lang.String, mpr, iv7, lR3, iv7, lR3, m88, int, int):void");
    }

    public static String w(int i2, int i3, String str) {
        if (i2 < 0) {
            return lTs.n("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return lTs.n("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(opT.Z("negative size: ", i3));
    }

    public static jy3 x(int i2) {
        if (i2 != 0 && i2 == 1) {
            return new m7I();
        }
        return new i0e();
    }

    public static BigInteger y(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        if (field instanceof ECFieldFp) {
            return ((ECFieldFp) field).getP();
        }
        throw new GeneralSecurityException("Only curves over prime order fields are supported");
    }

    public static final float z(float f, float f2, float f3) {
        return (f3 * f2) + ((((float) 1) - f3) * f);
    }
}
