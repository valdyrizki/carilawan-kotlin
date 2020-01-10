package com.vrizki.carilawankotlin.repository

import com.vrizki.carilawankotlin.model.Journal
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface JournalRepository : JpaRepository<Journal,Long>{
}