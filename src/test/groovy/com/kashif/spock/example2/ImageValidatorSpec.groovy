package com.kashif.spock.example2

import spock.lang.Specification
import spock.lang.Unroll

class ImageValidatorSpec extends Specification {
    @Unroll
    def "validate extensions of #fileToValidate"(){
        when: "Validator checks filename"
        def isValid = ImageValidator.validate(fileToValidate)

        then: "return appropriate result"
        isValid == expectedResult

        where: "input files are"

        fileToValidate  ||  expectedResult
        'someFile.jpg'  ||  false
        'someFile.jpg'  ||  true
        'someFile.jpeg' ||  true
        'someFile.png'  ||  true
        'someFile.tiff' ||  false

    }
}
