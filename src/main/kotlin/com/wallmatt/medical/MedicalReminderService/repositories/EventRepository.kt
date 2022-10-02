package com.wallmatt.medical.MedicalReminderService.repositories

import com.azure.spring.data.cosmos.repository.CosmosRepository
import com.wallmatt.medical.MedicalReminderService.models.dao.AdherenceEvent
import org.springframework.stereotype.Repository

@Repository
interface EventRepository : CosmosRepository<AdherenceEvent, String> {
}