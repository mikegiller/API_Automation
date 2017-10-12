node {
    try {
        stage 'Functional API tests'
        build 'SoapUI NG Pro functional test'
    } catch (all) {
        // doing some cleanup for stage one
        echo "Stage One failed!"
        throw all
    }  

try {
        stage "Performance API tests"
        build 'LoadUI'
    } catch (all) {
        echo "Stage Two failed!"
        throw all
    } 
}
