package com.wallmatt.medical.MedicalReminderService.repositories

import com.azure.spring.data.cosmos.repository.CosmosRepository
import com.wallmatt.medical.MedicalReminderService.models.dao.MedicationReminder
import org.springframework.stereotype.Repository

@Repository
interface ReminderRepository: CosmosRepository<MedicationReminder, String> {
}