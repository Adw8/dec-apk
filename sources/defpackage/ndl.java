package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: ndl  reason: default package */
/* loaded from: classes.dex */
public final class ndl {
    public final jAB R;

    /* renamed from: R  reason: collision with other field name */
    public final msD f6495R;

    public ndl(msD msd, int i) {
        if (i == 1) {
            this.f6495R = msd;
            this.R = new jAB(this, msd, 1);
        } else if (i == 2) {
            this.f6495R = msd;
            this.R = new jAB(this, msd, 3);
        } else if (i != 3) {
            this.f6495R = msd;
            this.R = new jAB(this, msd, 0);
        } else {
            this.f6495R = msd;
            this.R = new jAB(this, msd, 6);
        }
    }

    public final ArrayList R(String str) {
        ma1 R = ma1.R(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            R.Z(1);
        } else {
            R.H(1, str);
        }
        this.f6495R.v();
        Cursor L = this.f6495R.L(R);
        try {
            ArrayList arrayList = new ArrayList(L.getCount());
            while (L.moveToNext()) {
                arrayList.add(L.getString(0));
            }
            return arrayList;
        } finally {
            L.close();
            R.C();
        }
    }

    public final void X(h0c h0c) {
        this.f6495R.v();
        this.f6495R.c();
        try {
            this.R.X(h0c);
            this.f6495R.Z();
        } finally {
            this.f6495R.O();
        }
    }

    public final ArrayList c(String str) {
        ma1 R = ma1.R(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            R.Z(1);
        } else {
            R.H(1, str);
        }
        this.f6495R.v();
        Cursor L = this.f6495R.L(R);
        try {
            ArrayList arrayList = new ArrayList(L.getCount());
            while (L.moveToNext()) {
                arrayList.add(L.getString(0));
            }
            return arrayList;
        } finally {
            L.close();
            R.C();
        }
    }

    public final boolean e(String str) {
        boolean z = true;
        ma1 R = ma1.R(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            R.Z(1);
        } else {
            R.H(1, str);
        }
        this.f6495R.v();
        z = false;
        Cursor L = this.f6495R.L(R);
        try {
            if (L.moveToFirst()) {
                if (L.getInt(0) == 0) {
                    z = false;
                }
            }
            return z;
        } finally {
            L.close();
            R.C();
        }
    }

    public final Long v(String str) {
        ma1 R = ma1.R(1, "SELECT long_value FROM Preference where `key`=?");
        R.H(1, str);
        this.f6495R.v();
        Long l = null;
        Cursor L = this.f6495R.L(R);
        try {
            if (L.moveToFirst() && !L.isNull(0)) {
                l = Long.valueOf(L.getLong(0));
            }
            return l;
        } finally {
            L.close();
            R.C();
        }
    }
}
