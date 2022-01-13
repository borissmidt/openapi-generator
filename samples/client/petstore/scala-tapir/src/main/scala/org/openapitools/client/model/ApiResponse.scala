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
   * An uploaded response
   * Describes the result of uploading an image resource
   */
case class ApiResponse(
  code: Option[Int] = None,
  `type`: Option[String] = None,
  message: Option[String] = None
)
object ApiResponse{
    import io.circe._
    import io.circe.generic.semiauto._
    import org.openapitools.client.core.JsonSupport._
    implicit val codec: Codec[ApiResponse] = deriveCodec[ApiResponse]
}


