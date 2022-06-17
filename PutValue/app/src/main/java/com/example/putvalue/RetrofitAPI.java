package com.example.putvalue;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.PUT;
public interface RetrofitAPI {
    @PUT("api/users/2")
    Call<DataModal> updateData(@Body DataModal dataModal);
}
