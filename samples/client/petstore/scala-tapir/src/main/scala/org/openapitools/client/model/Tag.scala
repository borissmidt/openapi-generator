/**
 * OpenAPI Petstore
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model


  /**
   * Pet Tag
   * A tag for a pet
   */
case class Tag(
  id: Option[Long] = None,
  name: Option[String] = None
)
object Tag{
    import io.circe._
    import io.circe.generic.semiauto._
    import org.openapitools.client.core.JsonSupport._
    implicit val codec: Codec[Tag] = deriveCodec[Tag]
}


