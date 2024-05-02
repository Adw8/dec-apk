package defpackage;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: eDl  reason: default package */
/* loaded from: classes.dex */
public final class eDl extends eqw {
    public eDl() {
        super("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
    }

    @Override // defpackage.eqw
    public final boolean R() {
        Boolean bool;
        if (gCW.R()) {
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                gCW.f3692R.info("Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (!bool.booleanValue()) {
                return false;
            }
        }
        return true;
    }
}
