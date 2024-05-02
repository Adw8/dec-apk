package defpackage;

import android.os.Bundle;
import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: fqU  reason: default package */
/* loaded from: classes.dex */
public final class fqU extends iB8 {
    public final /* synthetic */ int R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fqU(int i) {
        super(true);
        this.R = i;
    }

    public final Integer O(String str) {
        int i;
        int i2;
        switch (this.R) {
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                if (iH_._(str, "0x", false)) {
                    String substring = str.substring(2);
                    jjU.X(16);
                    i2 = Integer.parseInt(substring, 16);
                } else {
                    i2 = Integer.parseInt(str);
                }
                return Integer.valueOf(i2);
            default:
                if (iH_._(str, "0x", false)) {
                    String substring2 = str.substring(2);
                    jjU.X(16);
                    i = Integer.parseInt(substring2, 16);
                } else {
                    i = Integer.parseInt(str);
                }
                return Integer.valueOf(i);
        }
    }

    @Override // defpackage.iB8
    public final Object R(String str, Bundle bundle) {
        switch (this.R) {
            case 0:
                return (boolean[]) bundle.get(str);
            case 1:
                return (Boolean) bundle.get(str);
            case 2:
                return (float[]) bundle.get(str);
            case 3:
                Object obj = bundle.get(str);
                if (obj != null) {
                    return Float.valueOf(((Float) obj).floatValue());
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
            case 4:
                return (int[]) bundle.get(str);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return X(str, bundle);
            case 6:
                return (long[]) bundle.get(str);
            case 7:
                Object obj2 = bundle.get(str);
                if (obj2 != null) {
                    return Long.valueOf(((Long) obj2).longValue());
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            case VmNativeCallback.$stable:
                return X(str, bundle);
            case 9:
                return (String[]) bundle.get(str);
            default:
                return (String) bundle.get(str);
        }
    }

    public final Integer X(String str, Bundle bundle) {
        switch (this.R) {
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                Object obj = bundle.get(str);
                if (obj != null) {
                    return Integer.valueOf(((Integer) obj).intValue());
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            default:
                Object obj2 = bundle.get(str);
                if (obj2 != null) {
                    return Integer.valueOf(((Integer) obj2).intValue());
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Override // defpackage.iB8
    public final Object c(String str) {
        long j;
        boolean z = false;
        switch (this.R) {
            case 0:
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 1:
                if (n3x.v(str, "true")) {
                    z = true;
                } else if (!n3x.v(str, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                return Boolean.valueOf(z);
            case 2:
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 3:
                return Float.valueOf(Float.parseFloat(str));
            case 4:
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return O(str);
            case 6:
                throw new UnsupportedOperationException("Arrays don't support default values.");
            case 7:
                String substring = str.endsWith("L") ? str.substring(0, str.length() - 1) : str;
                if (iH_._(str, "0x", false)) {
                    String substring2 = substring.substring(2);
                    jjU.X(16);
                    j = Long.parseLong(substring2, 16);
                } else {
                    j = Long.parseLong(substring);
                }
                return Long.valueOf(j);
            case VmNativeCallback.$stable:
                return O(str);
            case 9:
                throw new UnsupportedOperationException("Arrays don't support default values.");
            default:
                return str;
        }
    }

    @Override // defpackage.iB8
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.R) {
            case 0:
                bundle.putBooleanArray(str, (boolean[]) obj);
                return;
            case 1:
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            case 2:
                bundle.putFloatArray(str, (float[]) obj);
                return;
            case 3:
                bundle.putFloat(str, ((Number) obj).floatValue());
                return;
            case 4:
                bundle.putIntArray(str, (int[]) obj);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                int intValue = ((Number) obj).intValue();
                switch (this.R) {
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        bundle.putInt(str, intValue);
                        return;
                    default:
                        bundle.putInt(str, intValue);
                        return;
                }
            case 6:
                bundle.putLongArray(str, (long[]) obj);
                return;
            case 7:
                bundle.putLong(str, ((Number) obj).longValue());
                return;
            case VmNativeCallback.$stable:
                int intValue2 = ((Number) obj).intValue();
                switch (this.R) {
                    case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        bundle.putInt(str, intValue2);
                        return;
                    default:
                        bundle.putInt(str, intValue2);
                        return;
                }
            case 9:
                bundle.putStringArray(str, (String[]) obj);
                return;
            default:
                bundle.putString(str, (String) obj);
                return;
        }
    }

    @Override // defpackage.iB8
    public final String v() {
        switch (this.R) {
            case 0:
                return "boolean[]";
            case 1:
                return "boolean";
            case 2:
                return "float[]";
            case 3:
                return "float";
            case 4:
                return "integer[]";
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return "integer";
            case 6:
                return "long[]";
            case 7:
                return "long";
            case VmNativeCallback.$stable:
                return "reference";
            case 9:
                return "string[]";
            default:
                return "string";
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fqU(int i, int i2) {
        super(false);
        this.R = i;
    }
}
