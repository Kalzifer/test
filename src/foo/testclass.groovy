package foo

class testclass {
   static def DisplayName(script) {
        pyscript = script.libraryResource "python/test.py"
        script.writeFile file: 'test.py', text: pyscript
        script.sh "python text.py"
   } 
}
