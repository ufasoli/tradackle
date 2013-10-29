package controllers

import play.api.mvc.{Action, Controller}
import play.api.i18n.Lang
import play.api.data._
import play.api.data.Forms._
import play.api.Play.current
import play.api.mvc.Controller
import com.sun.org.apache.xml.internal.security.utils.I18n

/**
 * Created with IntelliJ IDEA.
 * User: Ulises Fasoli
 * Date: 29.10.13
 * Time: 15:01
 *
 */
object Locale extends Controller{

  val localeForm = Form("locale" -> nonEmptyText)

  def changeLocale(locale:String) = Action {implicit request =>
               println(locale)


    println(Lang(locale))

    val referrer = request.headers.get(REFERER).getOrElse("/")

    Redirect(referrer).withLang(Lang(locale))

  }

}
