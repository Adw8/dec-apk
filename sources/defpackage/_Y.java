package defpackage;

import java.text.CharacterIterator;

/* renamed from: _Y  reason: default package */
/* loaded from: classes.dex */
public final class _Y implements CharacterIterator {
    public final CharSequence R;
    public final int X;
    public final int e = 0;
    public int O = 0;

    public _Y(CharSequence charSequence, int i) {
        this.R = charSequence;
        this.X = i;
    }

    @Override // java.text.CharacterIterator, java.lang.Object
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.O;
        if (i == this.X) {
            return 65535;
        }
        return this.R.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.O = this.e;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.e;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.X;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.O;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.e;
        int i2 = this.X;
        if (i == i2) {
            this.O = i2;
            return 65535;
        }
        int i3 = i2 - 1;
        this.O = i3;
        return this.R.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.O + 1;
        this.O = i;
        int i2 = this.X;
        if (i < i2) {
            return this.R.charAt(i);
        }
        this.O = i2;
        return 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.O;
        if (i <= this.e) {
            return 65535;
        }
        int i2 = i - 1;
        this.O = i2;
        return this.R.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        int i2 = this.e;
        boolean z = false;
        if (i <= this.X && i2 <= i) {
            z = true;
        }
        if (z) {
            this.O = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
