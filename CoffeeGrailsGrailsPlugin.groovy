import asset.pipeline.AssetHelper
import asset.pipeline.coffee.CoffeeAssetFile

class CoffeeGrailsGrailsPlugin {
    def version = "0.1"
    def grailsVersion = "2.0 > *"
    def title = "CoffeeScript Grails Plugin"
    def author = "David Estes"
    def authorEmail = "destes@bcap.com"
    def description = "Provides coffee-script support for the asset-pipeline static asset management plugin."
    def documentation = "http://github.com/bertramdev/coffee-grails"

    def license = "APACHE"
    def organization = [ name: "Bertram Capital", url: "http://www.bertramcapital.com/" ]
    def issueManagement = [ system: "GITHUB", url: "http://github.com/bertramdev/coffee-grails/issues" ]
    def scm = [ url: "http://github.com/bertramdev/coffee-grails" ]

    def doWithDynamicMethods = { ctx ->
        AssetHelper.assetSpecs << CoffeeAssetFile
    }
}
