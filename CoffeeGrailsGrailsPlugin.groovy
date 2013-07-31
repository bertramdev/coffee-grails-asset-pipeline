class CoffeeGrailsGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "2.0 > *"
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
        "grails-app/views/error.gsp"
    ]

    // TODO Fill in these fields
    def title = "CoffeeScript Grails Plugin" // Headline display name of the plugin
    def author = "David Estes"
    def authorEmail = "destes@bcap.com"
    def description = "Provides coffee-script support for the asset-pipeline static asset management plugin."

    // URL to the plugin's documentation

    def documentation = "http://github.com/bertramdev/coffee-grails"

    def license = "APACHE"
    def organization = [ name: "Bertram Capital", url: "http://www.bertramcapital.com/" ]
    def issueManagement = [ system: "GITHUB", url: "http://github.com/bertramdev/coffee-grails/issues" ]
    def scm = [ url: "http://github.com/bertramdev/coffee-grails" ]

    def doWithDynamicMethods = { ctx ->
        asset.pipeline.AssetHelper.assetSpecs << asset.pipeline.coffee.CoffeeAssetFile
    }

}
