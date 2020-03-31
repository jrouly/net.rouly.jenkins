def call(String args) {
  sh """
    cp -r /sbt .sbt
    sbt \
      -Dsbt.ci=true \
      -Dsbt.global.base=.sbt \
      -Dsbt.boot.directory=.sbt \
      -Dsbt.ivy.home=.ivy2 \
      $args
  """
}
