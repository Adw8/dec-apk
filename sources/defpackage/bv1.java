package defpackage;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.play.core.review.ReviewInfo;
import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: bv1  reason: default package */
/* loaded from: classes.dex */
public final class bv1 implements Parcelable.Creator {
    public final /* synthetic */ int R;

    public /* synthetic */ bv1(int i) {
        this.R = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.R) {
            case 0:
                fKE fke = new fKE();
                int dataPosition = parcel.dataPosition();
                int readInt = parcel.readInt();
                try {
                    if (readInt >= 4) {
                        if (parcel.dataPosition() - dataPosition < readInt) {
                            fke.R = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
                            if (parcel.dataPosition() - dataPosition < readInt) {
                                fke.f3380R = parcel.readBoolean();
                                if (parcel.dataPosition() - dataPosition < readInt) {
                                    fke.f3381R = (kzi[]) parcel.createTypedArray(kzi.CREATOR);
                                    if (dataPosition > Integer.MAX_VALUE - readInt) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition > Integer.MAX_VALUE - readInt) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                        parcel.setDataPosition(dataPosition + readInt);
                        return fke;
                    }
                    throw new BadParcelableException("Parcelable too small");
                } catch (Throwable th) {
                    if (dataPosition > Integer.MAX_VALUE - readInt) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                    parcel.setDataPosition(dataPosition + readInt);
                    throw th;
                }
            case 1:
                kzi kzi = new kzi();
                int dataPosition2 = parcel.dataPosition();
                int readInt2 = parcel.readInt();
                try {
                    if (readInt2 >= 4) {
                        if (parcel.dataPosition() - dataPosition2 < readInt2) {
                            kzi.f5537R = parcel.readString();
                            if (parcel.dataPosition() - dataPosition2 < readInt2) {
                                kzi.R = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
                                if (parcel.dataPosition() - dataPosition2 < readInt2) {
                                    kzi.f5538R = parcel.readBoolean();
                                    if (dataPosition2 > Integer.MAX_VALUE - readInt2) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition2 > Integer.MAX_VALUE - readInt2) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition2 > Integer.MAX_VALUE - readInt2) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition2 > Integer.MAX_VALUE - readInt2) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                        parcel.setDataPosition(dataPosition2 + readInt2);
                        return kzi;
                    }
                    throw new BadParcelableException("Parcelable too small");
                } catch (Throwable th2) {
                    if (dataPosition2 > Integer.MAX_VALUE - readInt2) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                    parcel.setDataPosition(dataPosition2 + readInt2);
                    throw th2;
                }
            case 2:
                a98 a98 = new a98();
                int dataPosition3 = parcel.dataPosition();
                int readInt3 = parcel.readInt();
                try {
                    if (readInt3 >= 4) {
                        if (parcel.dataPosition() - dataPosition3 < readInt3) {
                            a98.f762R = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
                            if (parcel.dataPosition() - dataPosition3 < readInt3) {
                                a98.v = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
                                if (parcel.dataPosition() - dataPosition3 < readInt3) {
                                    a98.f764R = parcel.createTypedArrayList(ParcelFileDescriptor.CREATOR);
                                    if (parcel.dataPosition() - dataPosition3 < readInt3) {
                                        a98.c = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
                                        if (parcel.dataPosition() - dataPosition3 < readInt3) {
                                            a98.f763R = parcel.readString();
                                            if (parcel.dataPosition() - dataPosition3 < readInt3) {
                                                a98.R = parcel.readByte();
                                                if (parcel.dataPosition() - dataPosition3 < readInt3) {
                                                    a98.f765R = parcel.readBoolean();
                                                    if (parcel.dataPosition() - dataPosition3 < readInt3) {
                                                        a98.e = parcel.readInt();
                                                        if (parcel.dataPosition() - dataPosition3 < readInt3) {
                                                            a98.X = parcel.readInt();
                                                            if (parcel.dataPosition() - dataPosition3 < readInt3) {
                                                                a98.f767v = parcel.readString();
                                                                if (parcel.dataPosition() - dataPosition3 < readInt3) {
                                                                    a98.f766R = parcel.createStringArray();
                                                                    if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                                                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                                                    }
                                                                } else if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                                }
                                                            } else if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                                            }
                                                        } else if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                                        }
                                                    } else if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                                    }
                                                } else if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                }
                                            } else if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                            }
                                        } else if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                        parcel.setDataPosition(dataPosition3 + readInt3);
                        return a98;
                    }
                    throw new BadParcelableException("Parcelable too small");
                } catch (Throwable th3) {
                    if (dataPosition3 > Integer.MAX_VALUE - readInt3) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                    parcel.setDataPosition(dataPosition3 + readInt3);
                    throw th3;
                }
            case 3:
                return new l08(parcel);
            case 4:
                fhb fhb = new fhb();
                int dataPosition4 = parcel.dataPosition();
                int readInt4 = parcel.readInt();
                try {
                    if (readInt4 >= 4) {
                        if (parcel.dataPosition() - dataPosition4 < readInt4) {
                            fhb.R = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
                            if (parcel.dataPosition() - dataPosition4 < readInt4) {
                                fhb.v = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
                                if (parcel.dataPosition() - dataPosition4 < readInt4) {
                                    fhb.f3504R = parcel.readString();
                                    if (parcel.dataPosition() - dataPosition4 < readInt4) {
                                        fhb.c = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
                                        if (parcel.dataPosition() - dataPosition4 < readInt4) {
                                            fhb.f3506R = (fKE[]) parcel.createTypedArray(fKE.CREATOR);
                                            if (parcel.dataPosition() - dataPosition4 < readInt4) {
                                                fhb.f3505R = parcel.readBoolean();
                                                if (parcel.dataPosition() - dataPosition4 < readInt4) {
                                                    fhb.e = parcel.readInt();
                                                    if (parcel.dataPosition() - dataPosition4 < readInt4) {
                                                        fhb.X = parcel.readInt();
                                                        if (parcel.dataPosition() - dataPosition4 < readInt4) {
                                                            fhb.f3509v = parcel.readString();
                                                            if (parcel.dataPosition() - dataPosition4 < readInt4) {
                                                                fhb.f3508c = parcel.readString();
                                                                if (parcel.dataPosition() - dataPosition4 < readInt4) {
                                                                    fhb.f3507R = parcel.createStringArray();
                                                                    if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                                                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                                                    }
                                                                } else if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                                }
                                                            } else if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                                            }
                                                        } else if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                                        }
                                                    } else if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                                    }
                                                } else if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                                }
                                            } else if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                                                throw new BadParcelableException("Overflow in the size of parcelable");
                                            }
                                        } else if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                                            throw new BadParcelableException("Overflow in the size of parcelable");
                                        }
                                    } else if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                                        throw new BadParcelableException("Overflow in the size of parcelable");
                                    }
                                } else if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                                    throw new BadParcelableException("Overflow in the size of parcelable");
                                }
                            } else if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                                throw new BadParcelableException("Overflow in the size of parcelable");
                            }
                        } else if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                            throw new BadParcelableException("Overflow in the size of parcelable");
                        }
                        parcel.setDataPosition(dataPosition4 + readInt4);
                        return fhb;
                    }
                    throw new BadParcelableException("Parcelable too small");
                } catch (Throwable th4) {
                    if (dataPosition4 > Integer.MAX_VALUE - readInt4) {
                        throw new BadParcelableException("Overflow in the size of parcelable");
                    }
                    parcel.setDataPosition(dataPosition4 + readInt4);
                    throw th4;
                }
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return new wt(parcel);
            case 6:
                return new c28(parcel);
            case 7:
                return new AG(parcel);
            case VmNativeCallback.$stable /* 8 */:
                return new crL(parcel.readInt());
            case 9:
                return new g_h(parcel);
            case 10:
                return new H7(parcel);
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return new Ho(parcel);
            case 12:
                return new bxH(parcel);
            case 13:
                return new ehk(parcel);
            case 14:
                return new bzM(parcel);
            case 15:
                return new ouN(parcel);
            case 16:
                return new m6N(parcel);
            case 17:
                return new fDp(parcel);
            case 18:
                return new peG(parcel);
            case 19:
                return new ParcelImpl(parcel);
            case 20:
                return new ooN(parcel);
            case 21:
                return new BD((fhy) parcel.readParcelable(fhy.class.getClassLoader()), (fhy) parcel.readParcelable(fhy.class.getClassLoader()), (Ke) parcel.readParcelable(Ke.class.getClassLoader()), (fhy) parcel.readParcelable(fhy.class.getClassLoader()), parcel.readInt());
            case 22:
                return new aEW(parcel.readLong());
            case 23:
                return fhy.R(parcel.readInt(), parcel.readInt());
            case 24:
                return new Ju(parcel);
            case 25:
                return new gdM(parcel);
            default:
                return new cL7((PendingIntent) parcel.readParcelable(ReviewInfo.class.getClassLoader()), parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.R) {
            case 0:
                return new fKE[i];
            case 1:
                return new kzi[i];
            case 2:
                return new a98[i];
            case 3:
                return new l08[i];
            case 4:
                return new fhb[i];
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return new wt[i];
            case 6:
                return new c28[i];
            case 7:
                return new AG[i];
            case VmNativeCallback.$stable /* 8 */:
                return new crL[i];
            case 9:
                return new g_h[i];
            case 10:
                return new H7[i];
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                return new Ho[i];
            case 12:
                return new bxH[i];
            case 13:
                return new ehk[i];
            case 14:
                return new bzM[i];
            case 15:
                return new ouN[i];
            case 16:
                return new m6N[i];
            case 17:
                return new fDp[i];
            case 18:
                return new peG[i];
            case 19:
                return new ParcelImpl[i];
            case 20:
                return new ooN[i];
            case 21:
                return new BD[i];
            case 22:
                return new aEW[i];
            case 23:
                return new fhy[i];
            case 24:
                return new Ju[i];
            case 25:
                return new gdM[i];
            default:
                return new ReviewInfo[i];
        }
    }
}
