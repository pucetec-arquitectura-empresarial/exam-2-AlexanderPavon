package com.pucetec.exam2.exeptions.handlers

import com.pucetec.exam2.exeptions.exceptions.NoAvailableSpotsException

class GlobalHandleExceptions {
    @ExceptionHandler(NoAvailableSpotsException::class)
    fun handleNoAvailable(ex: NoAvailableSpotsException): ResponseEntity<Map<String, String>> =
        ResponseEntity(mapOf("error" to ex.message.orEmpty()), HttpStatus.NOT_FOUND)
}


