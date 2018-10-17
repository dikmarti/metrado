// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/didimart/metrado/conf/routes
// @DATE:Tue Oct 16 22:39:11 GFT 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
