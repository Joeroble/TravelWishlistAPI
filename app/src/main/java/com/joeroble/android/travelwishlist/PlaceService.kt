package com.joeroble.android.travelwishlist

import retrofit2.Response
import retrofit2.http.*

interface PlaceService {

    @GET("places/")
    suspend fun getAllPlaces(): Response<List<Place>>

    //POST create place
    @POST("places/")
    suspend fun addPlace(@Body place: Place): Response<Place>


    //todo update place - id of the place
    // data about the new place - send in the body of the request
    @PATCH("places/{id}/")
    suspend fun updatePlace(@Body place: Place, @Path("id") id: Int): Response<Place>



    // delete place
    @DELETE("places/{id}/")
    suspend fun deletePlace(@Path("id")id: Int): Response<String>

}