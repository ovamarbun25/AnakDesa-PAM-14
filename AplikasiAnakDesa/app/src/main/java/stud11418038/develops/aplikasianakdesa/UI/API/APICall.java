package stud11418038.develops.aplikasianakdesa.UI.API;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import stud11418038.develops.aplikasianakdesa.UI.Models.DefaultResponse;
import stud11418038.develops.aplikasianakdesa.UI.Models.LoginResponse;
import stud11418038.develops.aplikasianakdesa.UI.Models.UserResponse;

public interface APICall {
    @FormUrlEncoded
    @POST("createuser")
    Call<DefaultResponse> createUser(
            @Field("nama") String nama,
            @Field("umur") int umur,
            @Field("jeniskelamin") String jeniskelamin,
            @Field("domisili") String domisili,
            @Field("username") String username,
            @Field("password") String password
    );
    @FormUrlEncoded
    @POST("userlogin")
    Call<LoginResponse> userLogin(
            @Field("username") String usrnme,
            @Field("password") String password
    );
    @GET("allusers")
    Call<UserResponse> getUsers();


    @FormUrlEncoded
    @POST("updateuser/{id}")
    Call<LoginResponse> updateUser(
            @Path("id") int id,
            @Field("nama") String nama,
            @Field("umur") String umur,
            @Field("jeniskelamin") String jeniskelamin,
            @Field("domisili") String domisili,
            @Field("username") String username
    );

    @FormUrlEncoded
    @POST("updatepassword")
    Call<DefaultResponse> updatePassword(
            @Field("currentpassword") String currentpassword,
            @Field("newpassword") String newpassword,
            @Field("username") String username
    );

    @DELETE("deleteuser/{id}")
    Call<DefaultResponse> deleteUser(@Path("id") int id);
}
