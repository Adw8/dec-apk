package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ci  reason: default package */
/* loaded from: classes.dex */
public final class ci implements Z9 {
    public final ClipboardManager R;

    public ci(Context context) {
        this.R = (ClipboardManager) context.getSystemService("clipboard");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:127:0x008f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:98:0x01ee */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:128:0x008f */
    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: ned */
    /* JADX DEBUG: Multi-variable search result rejected for r27v0, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r31v0, resolved type: h5a */
    /* JADX DEBUG: Multi-variable search result rejected for r36v0, resolved type: hpO */
    /* JADX DEBUG: Multi-variable search result rejected for r36v1, resolved type: hpO */
    /* JADX DEBUG: Multi-variable search result rejected for r31v1, resolved type: h5a */
    /* JADX DEBUG: Multi-variable search result rejected for r27v1, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r24v1, resolved type: ned */
    /* JADX DEBUG: Multi-variable search result rejected for r36v2, resolved type: hpO */
    /* JADX DEBUG: Multi-variable search result rejected for r31v2, resolved type: h5a */
    /* JADX DEBUG: Multi-variable search result rejected for r27v2, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r24v2, resolved type: ned */
    /* JADX DEBUG: Multi-variable search result rejected for r36v3, resolved type: hpO */
    /* JADX DEBUG: Multi-variable search result rejected for r31v3, resolved type: h5a */
    /* JADX DEBUG: Multi-variable search result rejected for r24v3, resolved type: ned */
    /* JADX DEBUG: Multi-variable search result rejected for r36v4, resolved type: hpO */
    /* JADX DEBUG: Multi-variable search result rejected for r31v4, resolved type: h5a */
    /* JADX DEBUG: Multi-variable search result rejected for r27v4, resolved type: java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r24v4, resolved type: ned */
    /* JADX WARN: Multi-variable type inference failed */
    public final bz R() {
        ClipData primaryClip = this.R.getPrimaryClip();
        lIe lie = null;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            CharSequence text = itemAt != null ? itemAt.getText() : null;
            if (text != null) {
                if (!(text instanceof Spanned)) {
                    return new bz(text.toString(), null, 6);
                }
                Spanned spanned = (Spanned) text;
                Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
                ArrayList arrayList = new ArrayList();
                int length = annotationArr.length - 1;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        Annotation annotation = annotationArr[i];
                        if (n3x.v(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                            int spanStart = spanned.getSpanStart(annotation);
                            int spanEnd = spanned.getSpanEnd(annotation);
                            gL6 gl6 = new gL6(annotation.getValue());
                            long j = n3.O;
                            long j2 = eT9.v;
                            ned ned = lie;
                            hqI hqi = ned;
                            String str = hqi;
                            L0 l0 = str;
                            h5a h5a = l0;
                            ari ari = h5a;
                            hpO hpo = ari;
                            long j3 = j;
                            long j4 = j2;
                            while (true) {
                                int i2 = 1;
                                if (((Parcel) gl6.R).dataAvail() <= 1) {
                                    break;
                                }
                                byte readByte = ((Parcel) gl6.R).readByte();
                                if (readByte != 1) {
                                    if (readByte != 2) {
                                        if (readByte != 3) {
                                            if (readByte != 4) {
                                                if (readByte != 5) {
                                                    if (readByte == 6) {
                                                        str = ((Parcel) gl6.R).readString();
                                                    } else if (readByte != 7) {
                                                        if (readByte != 8) {
                                                            if (readByte != 9) {
                                                                if (readByte != 10) {
                                                                    if (readByte != 11) {
                                                                        if (readByte == 12) {
                                                                            if (gl6.Z() < 20) {
                                                                                break;
                                                                            }
                                                                            long readLong = ((Parcel) gl6.R).readLong();
                                                                            int i3 = n3.R;
                                                                            hpo = new hpO(readLong, aH9.N(gl6.m(), gl6.m()), gl6.m());
                                                                        }
                                                                    } else if (gl6.Z() < 4) {
                                                                        break;
                                                                    } else {
                                                                        int readInt = ((Parcel) gl6.R).readInt();
                                                                        ari = ari.c;
                                                                        boolean z = (readInt & 2) != 0;
                                                                        ari ari2 = ari.v;
                                                                        boolean z2 = (readInt & 1) != 0;
                                                                        if (z && z2) {
                                                                            List Y = pdD.Y(ari, ari2);
                                                                            Integer num = 0;
                                                                            int size = Y.size();
                                                                            for (int i4 = 0; i4 < size; i4++) {
                                                                                num = Integer.valueOf(((ari) Y.get(i4)).f1478R | num.intValue());
                                                                            }
                                                                            ari = new ari(num.intValue());
                                                                        } else if (!z) {
                                                                            ari = z2 ? ari2 : ari.R;
                                                                        }
                                                                    }
                                                                } else if (gl6.Z() < 8) {
                                                                    break;
                                                                } else {
                                                                    j3 = ((Parcel) gl6.R).readLong();
                                                                    int i5 = n3.R;
                                                                }
                                                            } else if (gl6.Z() < 8) {
                                                                break;
                                                            } else {
                                                                h5a = new h5a(gl6.m(), gl6.m());
                                                            }
                                                        } else if (gl6.Z() < 4) {
                                                            break;
                                                        } else {
                                                            l0 = new L0(gl6.m());
                                                        }
                                                    } else if (gl6.Z() < 5) {
                                                        break;
                                                    } else {
                                                        j4 = gl6.x();
                                                    }
                                                } else if (gl6.Z() < 1) {
                                                    break;
                                                } else {
                                                    byte readByte2 = ((Parcel) gl6.R).readByte();
                                                    if (readByte2 != 0) {
                                                        if (readByte2 != 1) {
                                                            if (readByte2 == 3) {
                                                                i2 = 3;
                                                            } else if (readByte2 == 2) {
                                                                i2 = 2;
                                                            }
                                                        }
                                                        hqi = new hqI(i2);
                                                    }
                                                    i2 = 0;
                                                    hqi = new hqI(i2);
                                                }
                                            } else if (gl6.Z() < 1) {
                                                break;
                                            } else {
                                                byte readByte3 = ((Parcel) gl6.R).readByte();
                                                if (readByte3 == 0 || readByte3 != 1) {
                                                    i2 = 0;
                                                }
                                                ned = new ned(i2);
                                            }
                                        } else if (gl6.Z() < 4) {
                                            break;
                                        } else {
                                            lie = new lIe(((Parcel) gl6.R).readInt());
                                        }
                                    } else if (gl6.Z() < 5) {
                                        break;
                                    } else {
                                        j2 = gl6.x();
                                    }
                                } else if (gl6.Z() < 8) {
                                    break;
                                } else {
                                    j = ((Parcel) gl6.R).readLong();
                                    int i6 = n3.R;
                                }
                            }
                            arrayList.add(new m3(spanStart, spanEnd, new eBF(j, j2, lie, ned, hqi, null, str, j4, l0, h5a, null, j3, ari, hpo)));
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                        lie = null;
                    }
                }
                return new bz(text.toString(), arrayList, 4);
            }
        }
        return null;
    }

    public final void v(bz bzVar) {
        CharSequence charSequence;
        int i;
        int i2;
        byte b;
        ClipboardManager clipboardManager = this.R;
        if (bzVar.f1883R.isEmpty()) {
            charSequence = bzVar.R;
        } else {
            SpannableString spannableString = new SpannableString(bzVar.R);
            h89 h89 = new h89(6);
            List list = bzVar.f1883R;
            int i3 = 0;
            for (int size = list.size(); i3 < size; size = size) {
                m3 m3Var = (m3) list.get(i3);
                eBF ebf = (eBF) m3Var.f5897R;
                int i4 = m3Var.R;
                int i5 = m3Var.v;
                ((Parcel) h89.R).recycle();
                h89.R = Parcel.obtain();
                long R = ebf.R();
                long j = n3.O;
                byte b2 = 1;
                if (!n3.c(R, j)) {
                    h89.Z((byte) 1);
                    i = i3;
                    ((Parcel) h89.R).writeLong(ebf.R());
                } else {
                    i = i3;
                }
                long j2 = ebf.R;
                long j3 = eT9.v;
                if (!eT9.R(j2, j3)) {
                    h89.Z((byte) 2);
                    i2 = i5;
                    h89.x(ebf.R);
                } else {
                    i2 = i5;
                }
                lIe lie = ebf.f3017R;
                if (lie != null) {
                    h89.Z((byte) 3);
                    ((Parcel) h89.R).writeInt(lie.f5651e);
                }
                ned ned = ebf.f3018R;
                if (ned != null) {
                    int i6 = ned.R;
                    h89.Z((byte) 4);
                    if (!(i6 == 0)) {
                        if (i6 == 1) {
                            b = 1;
                            h89.Z(b);
                        }
                    }
                    b = 0;
                    h89.Z(b);
                }
                hqI hqi = ebf.f3015R;
                if (hqi != null) {
                    int i7 = hqi.R;
                    h89.Z((byte) 5);
                    if (!(i7 == 0)) {
                        if (!(i7 == 1)) {
                            if (i7 == 2) {
                                b2 = 2;
                            } else {
                                if (i7 != 3) {
                                    b2 = 0;
                                }
                                if (b2 != 0) {
                                    b2 = 3;
                                }
                            }
                        }
                        h89.Z(b2);
                    }
                    b2 = 0;
                    h89.Z(b2);
                }
                String str = ebf.f3016R;
                if (str != null) {
                    h89.Z((byte) 6);
                    ((Parcel) h89.R).writeString(str);
                }
                if (!eT9.R(ebf.v, j3)) {
                    h89.Z((byte) 7);
                    h89.x(ebf.v);
                }
                L0 l0 = ebf.f3008R;
                if (l0 != null) {
                    float f = l0.R;
                    h89.Z((byte) 8);
                    h89.m(f);
                }
                h5a h5a = ebf.f3013R;
                if (h5a != null) {
                    h89.Z((byte) 9);
                    h89.m(h5a.f4049R);
                    h89.m(h5a.v);
                }
                if (!n3.c(ebf.c, j)) {
                    h89.Z((byte) 10);
                    ((Parcel) h89.R).writeLong(ebf.c);
                }
                ari ari = ebf.f3009R;
                if (ari != null) {
                    h89.Z((byte) 11);
                    ((Parcel) h89.R).writeInt(ari.f1478R);
                }
                hpO hpo = ebf.f3014R;
                if (hpo != null) {
                    h89.Z((byte) 12);
                    ((Parcel) h89.R).writeLong(hpo.f4390R);
                    h89.m(aWo.e(hpo.v));
                    h89.m(aWo.X(hpo.v));
                    h89.m(hpo.f4389R);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) h89.R).marshall(), 0)), i4, i2, 33);
                i3 = i + 1;
            }
            charSequence = spannableString;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
