package com.ronik.android_clean_architecture_mvvm_compose.domain.model

import com.ronik.android_clean_architecture_mvvm_compose.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>
)
