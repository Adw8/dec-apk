package defpackage;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: nul  reason: default package */
/* loaded from: classes.dex */
public final class nul {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f6626R;
    public Object c;
    public Object e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public Object f6627v;

    public nul(Context context, ConstraintLayout constraintLayout, int i) {
        this.R = -1;
        this.v = -1;
        this.f6627v = new SparseArray();
        this.c = new SparseArray();
        car car = null;
        this.e = null;
        this.f6626R = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            while (true) {
                boolean z = true;
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    z = true;
                                    break;
                                }
                                z = true;
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    z = true;
                                    break;
                                }
                                z = true;
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    break;
                                }
                                z = true;
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    z = false;
                                    break;
                                }
                                z = true;
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    z = true;
                                    break;
                                }
                                z = true;
                                break;
                            default:
                                z = true;
                                break;
                        }
                        if (z) {
                            car car2 = new car(context, xml);
                            ((SparseArray) this.f6627v).put(car2.R, car2);
                            car = car2;
                        } else if (z) {
                            j5N j5n = new j5N(context, xml);
                            if (car != null) {
                                ((ArrayList) car.f2152R).add(j5n);
                            }
                        } else if (z) {
                            R(context, xml);
                        }
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0226, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
        // Method dump skipped, instructions count: 662
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nul.R(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public /* synthetic */ nul(k1p k1p) {
        String V = k1p.V();
        this.f6626R = V;
        if (V.equals(ym.v)) {
            try {
                L3 t = L3.t(k1p.o(), nCG.R());
                this.f6627v = (rm) kWP.e(k1p);
                this.R = t.g();
            } catch (b7b e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (V.equals(ym.R)) {
            try {
                _x V2 = _x.V(k1p.o(), nCG.R());
                this.c = (WX) kWP.e(k1p);
                this.v = V2.y().t();
                this.R = this.v + V2.t().t();
            } catch (b7b e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (V.equals(nKz.R)) {
            try {
                Ak t2 = Ak.t(k1p.o(), nCG.R());
                this.e = (nc) kWP.e(k1p);
                this.R = t2.g();
            } catch (b7b e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException(opT.H("unsupported AEAD DEM key type: ", V));
        }
    }
}
