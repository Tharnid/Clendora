package controllers

import play.api._
import play.api.mvc._
import play.api.libs.auth.oauth.{ConsumerKey, RequestToken}
import play.api.Play.current
import scala.concurrent.Future
import play.api.libs.concurrent.Execution.Implicits._
import play.api.libs.ws._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def tweets = Action.async {
      val credentials: Option[(ConsumerKey, RequestToken)] = for {
      apiKey <- Play.configuration.getString("twitter.apiKey")
      apiSecret <- Play.configuration.getString("twitter.apiSecret")
      token <- Play.configuration.getString("twitter.token")
      tokenSecret <- Play.configuration.getString("twitter.tokenSecret")
    } yield (
      ConsumerKey(apiKey, apiSecret),
      RequestToken(token, tokenSecret)
    )
    credentials.map { case (consumerKey, requestToken) =>
      Future {
        Ok
      }
    } getOrElse {
      Future {
        InternalServerError("Twitter credentials missing")
      }
    }
  }

}
