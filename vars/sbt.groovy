def call(String args) {
  sh """
    sbt -Dsbt.global.base=.sbt \
      -Dsbt.boot.directory=.sbt \
      -Dsbt.ivy.home=.ivy2 \
      $args
  """
}
