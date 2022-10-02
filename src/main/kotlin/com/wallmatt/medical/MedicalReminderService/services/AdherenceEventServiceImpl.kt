package com.wallmatt.medical.MedicalReminderService.services

import com.wallmatt.medical.MedicalReminderService.repositories.EventRepository
import org.springframework.stereotype.Service

@Service
class AdherenceEventServiceImpl(datapointRepo: EventRepository) : AdherenceEventService {
}