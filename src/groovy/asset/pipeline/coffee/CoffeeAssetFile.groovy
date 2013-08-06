package asset.pipeline.coffee

class CoffeeAssetFile {
	static final String contentType = 'application/javascript'
	static extensions = ['coffee', 'js.coffee']
	static final String compiledExtension = 'js'
	static processors = [CoffeeScriptProcessor]

	File file
	def baseFile

	CoffeeAssetFile(file, baseFile=null) {
		this.file = file
		this.baseFile = baseFile
	}

	def processedStream() {
		def fileText = file?.text
		for(processor in processors) {
			def processInstance = processor.newInstance()
			fileText = processInstance.process(fileText, this)
			// TODO Iterate Over Processors
		}
		return fileText
		// Return File Stream
	}

	def directiveForLine(line) {
		line.find(/#=(.*)/) { fullMatch, directive -> return directive }
	}
}
