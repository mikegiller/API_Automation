node {
    try {
        stage 'Functional API tests'
        build 'SoapUI NG Pro functional test'
    } catch (all) {
        // doing some cleanup for stage one
        throw new Exception("Stage One failed!")
    }  

try {
        stage "Performance API tests"
        build 'LoadUI'
    } catch (all) {
        // doing some cleanup for stage two
        throw new Exception("Stage Two failed!")
    } 
}
