package defpackage;

/* renamed from: lPe  reason: default package */
/* loaded from: classes.dex */
public abstract class lPe {
    public static final L2 L;
    public static final L2 O;
    public static final L2 R;
    public static final L2 X;
    public static final L2 Z;
    public static final L2 c;
    public static final L2 e;
    public static final L2 m;
    public static final L2 v;

    static {
        L2 v2 = L2.v();
        v2.v = 3;
        v2.f269R = "Google Play In-app Billing API version is less than 3";
        R = v2.R();
        L2 v3 = L2.v();
        v3.v = 3;
        v3.f269R = "Google Play In-app Billing API version is less than 9";
        v3.R();
        L2 v4 = L2.v();
        v4.v = 3;
        v4.f269R = "Billing service unavailable on device.";
        v = v4.R();
        L2 v5 = L2.v();
        v5.v = 5;
        v5.f269R = "Client is already in the process of connecting to billing service.";
        c = v5.R();
        L2 v6 = L2.v();
        v6.v = 5;
        v6.f269R = "The list of SKUs can't be empty.";
        v6.R();
        L2 v7 = L2.v();
        v7.v = 5;
        v7.f269R = "SKU type can't be empty.";
        v7.R();
        L2 v8 = L2.v();
        v8.v = 5;
        v8.f269R = "Product type can't be empty.";
        e = v8.R();
        L2 v9 = L2.v();
        v9.v = -2;
        v9.f269R = "Client does not support extra params.";
        v9.R();
        L2 v10 = L2.v();
        v10.v = 5;
        v10.f269R = "Invalid purchase token.";
        v10.R();
        L2 v11 = L2.v();
        v11.v = 6;
        v11.f269R = "An internal error occurred.";
        X = v11.R();
        L2 v12 = L2.v();
        v12.v = 5;
        v12.f269R = "SKU can't be null.";
        v12.R();
        L2 v13 = L2.v();
        v13.v = 0;
        O = v13.R();
        L2 v14 = L2.v();
        v14.v = -1;
        v14.f269R = "Service connection is disconnected.";
        L = v14.R();
        L2 v15 = L2.v();
        v15.v = -3;
        v15.f269R = "Timeout communicating with service.";
        Z = v15.R();
        L2 v16 = L2.v();
        v16.v = -2;
        v16.f269R = "Client does not support subscriptions.";
        v16.R();
        L2 v17 = L2.v();
        v17.v = -2;
        v17.f269R = "Client does not support subscriptions update.";
        v17.R();
        L2 v18 = L2.v();
        v18.v = -2;
        v18.f269R = "Client does not support get purchase history.";
        v18.R();
        L2 v19 = L2.v();
        v19.v = -2;
        v19.f269R = "Client does not support price change confirmation.";
        v19.R();
        L2 v20 = L2.v();
        v20.v = -2;
        v20.f269R = "Play Store version installed does not support cross selling products.";
        v20.R();
        L2 v21 = L2.v();
        v21.v = -2;
        v21.f269R = "Client does not support multi-item purchases.";
        v21.R();
        L2 v22 = L2.v();
        v22.v = -2;
        v22.f269R = "Client does not support offer_id_token.";
        v22.R();
        L2 v23 = L2.v();
        v23.v = -2;
        v23.f269R = "Client does not support ProductDetails.";
        m = v23.R();
        L2 v24 = L2.v();
        v24.v = -2;
        v24.f269R = "Client does not support in-app messages.";
        v24.R();
        L2 v25 = L2.v();
        v25.v = -2;
        v25.f269R = "Client does not support alternative billing.";
        v25.R();
        L2 v26 = L2.v();
        v26.v = 5;
        v26.f269R = "Unknown feature";
        v26.R();
    }
}