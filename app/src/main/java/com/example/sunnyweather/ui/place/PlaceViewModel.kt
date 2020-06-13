package com.example.sunnyweather.ui.place

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.sunnyweather.logic.Repository
import com.example.sunnyweather.logic.model.Place
import java.util.*

/*******************************************************************
 * PlaceViewModel.java  2020-06-12
 * <P>
 * class desc:<br/>
 * </p>
 * @author:Xiell
 ******************************************************************/
class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData : LiveData<Result<List<Place>>> = Transformations.switchMap(searchLiveData) { query ->
        Log.d("PlaceViewModel",Thread.currentThread().name)
        Repository.searchPlaces(query)
    }
    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }


    fun savePlace(place:Place) = Repository.savePlace(place)

    fun getSavedPlace() = Repository.getSavedPlace()

    fun isPlaceSaved() = Repository.isPlaceSaved()
}