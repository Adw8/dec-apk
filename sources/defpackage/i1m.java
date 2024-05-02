package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: i1m  reason: default package */
/* loaded from: classes.dex */
public final class i1m {
    public static final Charset R = Charset.forName("UTF-8");

    /* renamed from: R  reason: collision with other field name */
    public final InputStream f4439R;

    public i1m(ByteArrayInputStream byteArrayInputStream) {
        this.f4439R = byteArrayInputStream;
    }

    public static hPF R(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2053249079:
                if (str.equals("LEGACY")) {
                    c = 0;
                    break;
                }
                break;
            case 80904:
                if (str.equals("RAW")) {
                    c = 1;
                    break;
                }
                break;
            case 2575090:
                if (str.equals("TINK")) {
                    c = 2;
                    break;
                }
                break;
            case 1761684556:
                if (str.equals("CRUNCHY")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return hPF.LEGACY;
            case 1:
                return hPF.RAW;
            case 2:
                return hPF.TINK;
            case 3:
                return hPF.CRUNCHY;
            default:
                throw new bia(opT.H("unknown output prefix type: ", str));
        }
    }

    public static aLF v(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -891611359:
                if (str.equals("ENABLED")) {
                    c = 0;
                    break;
                }
                break;
            case 478389753:
                if (str.equals("DESTROYED")) {
                    c = 1;
                    break;
                }
                break;
            case 1053567612:
                if (str.equals("DISABLED")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return aLF.ENABLED;
            case 1:
                return aLF.DESTROYED;
            case 2:
                return aLF.DISABLED;
            default:
                throw new bia(opT.H("unknown status: ", str));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:88)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:452)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:51)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final defpackage.dxG c() {
        /*
        // Method dump skipped, instructions count: 550
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i1m.c():dxG");
    }
}
