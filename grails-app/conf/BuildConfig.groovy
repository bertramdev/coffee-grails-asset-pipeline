grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenCentral()
	}

	dependencies {
		compile 'com.bertramlabs.plugins:coffee-asset-pipeline:2.6.0'
	}
	plugins {

		runtime ":asset-pipeline:2.6.0"

		build ':release:3.1.1', ':rest-client-builder:2.0.1', {
            export = false
        }
	}
}
