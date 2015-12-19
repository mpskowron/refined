package eu.timepit.refined
package internal

import eu.timepit.refined.api.{ RefType, Validate }

final class RefineMFullyApplied[F[_, _], T, P] {

  def apply(t: T)(implicit v: Validate[T, P], rt: RefType[F]): F[T, P] = macro RefineM.macroImpl[F, T, P]
}