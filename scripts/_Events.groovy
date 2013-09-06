// includeTargets << new File(assetPipelinePluginDir, "scripts/_AssetCompile.groovy")

eventAssetPrecompileStart = { assetSpecs ->
	def coffeeAssetFile = classLoader.loadClass('asset.pipeline.coffee.CoffeeAssetFile')
	assetSpecs.specs << coffeeAssetFile
}
