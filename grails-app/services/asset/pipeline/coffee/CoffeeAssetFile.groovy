package asset.pipeline.coffee
import asset.pipeline.*

class CoffeeAssetFile {
	static final String contentType = 'application/javascript'
	static extensions = ['coffee', 'js.coffee']
	static compiledExtension = 'js'
	static processors = [CoffeeScriptProcessor]

	File file

	CoffeeAssetFile(file) {
		this.file = file
	}

	def processedStream() {
		def fileText = file?.text
		for(processor in processors) {
			def processInstance = processor.newInstance()
			fileText = processInstance.process(fileText)
			// TODO Iterate Over Processors
		}
		return fileText
		// Return File Stream
	}

	def directiveForLine(line) {
		line.find(/#=(.*)/) { fullMatch, directive -> return directive }
	}
}
