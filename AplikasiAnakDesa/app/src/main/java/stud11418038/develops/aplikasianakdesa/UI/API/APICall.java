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
            @Field("umur") String umur,
            @Field("jeniskelamin") String gender,
            @Field("domisili") String domisili,
            @Field("username") String username,
            @Field("password") String password
    );
    @FormUrlEncoded
    @POST("userlogin")
    Call<LoginResponse> userLogin(
            @Field("username") String username,
            @Field("password") String password
    );
    @GET("allusers")
    Call<UserResponse> getUsers();


    @FormUrlEncoded
    @POST("updateuser/{id}")
    Call<LoginResponse> updateUser(
            @Field("username") String username,
            @Path("nama") String nama,
            @Field("email") String email
    );

    @FormUrlEncoded
    @POST("updatepassword")
    Call<DefaultResponse> updatePassword(
            @Field("currentpassword") String currentpassword,
            @Field("newpassword") String newpassword,
            @Field("username") String email
    );

    @DELETE("deleteuser/{username}")
    Call<DefaultResponse> deleteUser(@Path("username") String username);
}
