package defpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.zip.ZipOutputStream;

/* renamed from: jq9  reason: default package */
/* loaded from: classes.dex */
public final class jq9 extends k8G implements f_c {
    public final /* synthetic */ ZipOutputStream R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq9(ZipOutputStream zipOutputStream, int i) {
        super(0);
        this.X = i;
        this.R = zipOutputStream;
    }

    public final void R() {
        Throwable th = null;
        switch (this.X) {
            case 0:
                String V = gvP.V(-3881549238891964307L);
                ZipOutputStream zipOutputStream = this.R;
                InputStreamReader inputStreamReader = new InputStreamReader(Runtime.getRuntime().exec(V).getInputStream(), O1.R);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    pn pnVar = new pn(bufferedReader);
                    Iterator it = (pnVar instanceof nux ? pnVar : new nux(pnVar)).iterator();
                    while (it.hasNext()) {
                        zipOutputStream.write(iH_.z(((String) it.next()) + "\n"));
                    }
                    return;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            default:
                String V2 = gvP.V(-3881544029096634259L);
                ZipOutputStream zipOutputStream2 = this.R;
                InputStreamReader inputStreamReader2 = new InputStreamReader(Runtime.getRuntime().exec(V2).getInputStream(), O1.R);
                BufferedReader bufferedReader2 = inputStreamReader2 instanceof BufferedReader ? (BufferedReader) inputStreamReader2 : new BufferedReader(inputStreamReader2, 8192);
                try {
                    pn pnVar2 = new pn(bufferedReader2);
                    Iterator it2 = (pnVar2 instanceof nux ? pnVar2 : new nux(pnVar2)).iterator();
                    while (it2.hasNext()) {
                        zipOutputStream2.write(iH_.z(((String) it2.next()) + "\n"));
                    }
                    return;
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
