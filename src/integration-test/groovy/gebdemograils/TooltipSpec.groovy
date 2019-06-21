package gebdemograils

import geb.spock.GebSpec
import grails.testing.mixin.integration.Integration

@Integration
class TooltipSpec extends GebSpec {

    void 'test logo tooltip'() {
        when:
        to HomePage

        then:
        at HomePage

        and:
        logoTooltip == 'Grails Demo App Tooltip'
    }
}
