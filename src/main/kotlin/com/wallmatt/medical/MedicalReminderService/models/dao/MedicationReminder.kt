package com.wallmatt.medical.MedicalReminderService.models.dao

import com.azure.spring.data.cosmos.core.mapping.Container

@Container(containerName = "MedicationReminder", autoScale = true)
class MedicationReminder {
}