package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {


  def index = Action {implicit request =>
      Ok(views.html.index())
  }

  def team()= Action{implicit request =>

    Ok(views.html.index())
  }

}