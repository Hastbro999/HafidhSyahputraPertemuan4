package com.hafidhsyahputrapertemuan4.data

import com.hafidhsyahputrapertemuan4.R
import com.hafidhsyahputrapertemuan4.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3)
        )
    }
}