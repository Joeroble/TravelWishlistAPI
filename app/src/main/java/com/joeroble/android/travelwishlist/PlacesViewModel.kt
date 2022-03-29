package com.joeroble.android.travelwishlist

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

const val TAG = "PLACES_VIEW_MODEL"
class PlacesViewModel: ViewModel() {

//    private val places = mutableListOf<Place>(
//        Place("Auckland", "Hobbits!", starred = true),
//        Place("Patagonia", "seems cool!", starred = false),
//        Place("Ely, MN", "Its a place that exists"))

    private val placeRepository = PlaceRepository()

    val allPlaces = MutableLiveData<List<Place>>(listOf<Place>())

    init{
        getPlaces()
    }

    fun getPlaces(){
        viewModelScope.launch{
            val places = placeRepository.getAllPlaces()
            allPlaces.postValue(places)
        }
    }

    fun addNewPlace(place: Place){


    }


    fun deletePlace(place: Place){

    }

    fun updatePlace(place: Place){

    }

}