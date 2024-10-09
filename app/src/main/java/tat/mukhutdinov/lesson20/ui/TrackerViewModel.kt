package tat.mukhutdinov.lesson20.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import tat.mukhutdinov.lesson20.data.Juice
import tat.mukhutdinov.lesson20.data.JuiceRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

/**
 * ViewModel to retrieve, delete a juice entry from the [JuiceRepository]'s data source.
 */
class TrackerViewModel(private val juiceRepository: JuiceRepository): ViewModel()  {

    val juicesStream: Flow<List<Juice>> = juiceRepository.juicesStream

    fun deleteJuice(juice: Juice) = viewModelScope.launch {
        juiceRepository.deleteJuice(juice)
    }
}
