package defpackage;

import java.util.List;

/* renamed from: deW  reason: default package */
/* loaded from: classes.dex */
public final class deW extends k8G implements kg9 {
    public final /* synthetic */ kY5 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ deW(kY5 ky5, int i) {
        super(1);
        this.X = i;
        this.R = ky5;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        kg9 kg9;
        o8s o8s;
        mQD mqd;
        o3Z o3z = null;
        boolean z = false;
        switch (this.X) {
            case 0:
                dlc dlc = (dlc) obj;
                return new acE(1, this.R);
            case 1:
                hjM hjm = (hjM) obj;
                mjp c = this.R.c();
                if (c != null) {
                    c.v = hjm;
                }
                return o8s.R;
            case 2:
                List list = (List) obj;
                if (this.R.c() != null) {
                    list.add(this.R.c().f6140R);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                deW dew = this.R.f5335R;
                String str = ((bz) obj).R;
                int length = str.length();
                dew.x(new d5M(str, dtx.e(length, length), 4));
                return Boolean.TRUE;
            case 4:
                int i = ((j8k) obj).R;
                CV cv = this.R.R;
                cv.getClass();
                if (i == 7) {
                    kg9 = cv.j().f3048R;
                } else {
                    if (i == 2) {
                        kg9 = cv.j().v;
                    } else {
                        if (i == 6) {
                            kg9 = cv.j().c;
                        } else {
                            if (i == 5) {
                                kg9 = cv.j().e;
                            } else {
                                if (i == 3) {
                                    kg9 = cv.j().X;
                                } else {
                                    if (i == 4) {
                                        kg9 = cv.j().O;
                                    } else {
                                        if ((i == 1) || i == 0) {
                                            kg9 = null;
                                        } else {
                                            throw new IllegalStateException("invalid ImeAction".toString());
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (kg9 != null) {
                    kg9.x(cv);
                    o8s = o8s.R;
                } else {
                    o8s = null;
                }
                if (o8s == null) {
                    if (i == 6) {
                        cjR cjr = (cjR) cv.v;
                        if (cjr != null) {
                            o3z = cjr;
                        }
                        ((o3Z) o3z).v(1);
                    } else {
                        if (i == 5) {
                            cjR cjr2 = (cjR) cv.v;
                            if (cjr2 != null) {
                                o3z = cjr2;
                            }
                            o3z.v(2);
                        } else {
                            if (i == 7) {
                                z = true;
                            }
                            if (z && (mqd = (mQD) cv.c) != null && n3x.v((mQD) mqd.f6031R.f5384R.get(), mqd)) {
                                ((egg) mqd.R).f3178R.e(dx5.HideKeyboard);
                            }
                        }
                    }
                }
                return o8s.R;
            default:
                d5M d5m = (d5M) obj;
                String str2 = d5m.f2488R.R;
                bz bzVar = this.R.f5332R;
                if (!n3x.v(str2, bzVar != null ? bzVar.R : null)) {
                    this.R.e.R(m3z.None);
                }
                this.R.f5339R.x(d5m);
                dYh dyh = this.R.f5334R;
                hAe hae = dyh.f2665R;
                if (hae != null) {
                    hae.g(dyh, null);
                }
                return o8s.R;
        }
    }
}
